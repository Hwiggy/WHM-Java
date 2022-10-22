package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateoauthcredentials/
 */
public class UpdateOAuthCredentialPayload extends Payload {

    public UpdateOAuthCredentialPayload(int credentialID) {
        super("UpdateOAuthCredential");
        put("credentialId", credentialID);
    }

    /***
     *
     * @param clientApiIdentifier The OAuth API Client Credential Unique Identifier (Client ID) to be updated. Only required if credentialId is not known/passed.
     */
    public UpdateOAuthCredentialPayload withClientApiIdentifier(String clientApiIdentifier) {
        put("clientApiIdentifier", clientApiIdentifier);
        return this;
    }

    /***
     *
     * @param name The name to assign
     */
    public UpdateOAuthCredentialPayload withName(String name) {
        put("name", name);
        return this;
    }

    /***
     *
     * @param description The description to assign
     */
    public UpdateOAuthCredentialPayload withDescription(String description) {
        put("description", description);
        return this;
    }

    /***
     *
     * @param grantType The grant type for which the credential set is valid for. Possible values include: authorization_code or single_sign_on
     */
    public UpdateOAuthCredentialPayload withGrantType(String grantType) {
        put("grantType", grantType);
        return this;
    }

    /***
     *
     * @param scope A space delimited list of the scopes for which the credential set is valid. See CreateOAuthCredential for permitted values
     */
    public UpdateOAuthCredentialPayload withScope(String scope) {
        put("scope", scope);
        return this;
    }

    /***
     *
     * @param serviceID The service ID for which the credential relates to
     */
    public UpdateOAuthCredentialPayload withServiceID(int serviceID) {
        put("serviceId", serviceID);
        return this;
    }

    /***
     *
     * @param logoUri The logoUri to assign
     */
    public UpdateOAuthCredentialPayload withLogoUri(String... logoUri) {
        put("logoUri", logoUri);
        return this;
    }

    /***
     *
     * @param redirectUri An array of Authorized Redirect URIs
     */
    public UpdateOAuthCredentialPayload withRedirectUri(String redirectUri) {
        put("redirectUri", redirectUri);
        return this;
    }

    /***
     *
     * @param resetSecret Set to true to reset the OAuth API Client Credential Secret
     */
    public UpdateOAuthCredentialPayload withResetSecret(boolean resetSecret) {
        put("resetSecret", resetSecret);
        return this;
    }
}
