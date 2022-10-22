package me.hwiggy.whmjava;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

/***
 * This class is the entrypoint for the WHMCS Accessor
 * The URL parameter should point to a site like the following:
 * "https://yourdomain.com/whmcs/api.php"
 * The default constructor uses the new version of the WHMCS API, which requires an Identifier and a Secret
 * These semantics are defined at the following URL:
 * <a href="https://developers.whmcs.com/api/authentication/">API Documentation</a>
 */
public class WHMCS {
    private final HttpClient client = HttpClient.newHttpClient();
    private final String url, identifier, secret;
    private final boolean oldAuth;

    /***
     *
     * @param oldAuth Whether to use Username/Password authentication
     * @param url The URL of your WHMCS API Endpoint
     * @param username The Username to authenticate with
     * @param password The Password to authenticate with
     */
    public WHMCS(boolean oldAuth, String url, String username, String password){
        this.oldAuth = oldAuth;
        this.url = url;
        this.identifier = username;
        this.secret = password;
    }

    /***
     *
     * @param url The URL of your WHMCS API Endpoint
     * @param identifier The Identifier to authenticate with
     * @param secret The Secret to authenticate with
     */
    public WHMCS(String url, String identifier, String secret){
        this(false, url, identifier, secret);
    }

    /***
     *
     * @param payload The Payload to submit to the API
     * @return The API Response, as JSON
     * @throws IOException if an I/O error occurs when sending or receiving
     * @throws InterruptedException if the operation is interrupted
     * @throws IllegalArgumentException if the {@code request} argument is not
     *         a request that could have been validly built as specified by {@link
     *         HttpRequest.Builder HttpRequest.Builder}.
     * @throws SecurityException If a security manager has been installed,
     *          and it denies {@link java.net.URLPermission access} to the
     *          URL in the given request, or proxy if one is configured.
     *          See <a href="#securitychecks">security checks</a> for further
     *          information.
     */
    public JSONObject submitPayload(Payload payload) throws IOException, InterruptedException {
        if (oldAuth){
            payload.put("username", identifier).put("password", secret);
        } else {
            payload.put("identifier", identifier).put("secret", secret);
        }
        String params = payload.toMap().entrySet().stream()
                .filter(it -> !it.getValue().toString().isEmpty())
                .map(it -> it.getKey() + "=" + it.getValue())
                .collect(Collectors.joining("&"));
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url + "?" + params))
                //.uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String response = httpResponse.body();
        return new JSONObject(response);
    }
}
