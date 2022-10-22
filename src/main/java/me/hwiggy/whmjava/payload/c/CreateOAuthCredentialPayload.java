package me.hwiggy.whmjava.payload.c;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/createoauthcredential/
 */
public class CreateOAuthCredentialPayload extends Payload {

    /***
     *
     * @param grantType One of ‘authorization_code’ or ‘single_sign_on’
     * @param scope A space separated list of valid scopes from tbloauthserver_scopes
     */
    public CreateOAuthCredentialPayload(String grantType, String scope) {
        super("CreateOAuthCredential");
        put("grantType", grantType);
        put("scope", scope);
    }

    /***
     *
     * @param name The name to give the oAuth Credential for the authorization_code $grantType
     * @return This Payload, for chaining
     */
    public CreateOAuthCredentialPayload withName(String name){
        put("name", name);
        return this;
    }

    /***
     *
     * @param serviceID The id of the service for the single_sign_on $grantType
     * @return This Payload, for chaining
     */
    public CreateOAuthCredentialPayload withServiceID(int serviceID){
        put("serviceid", serviceID);
        return this;
    }

    /***
     *
     * @param description The description of the OAuth Credential
     * @return This Payload, for chaining
     */
    public CreateOAuthCredentialPayload withDescription(String description){
        put("description", description);
        return this;
    }

    /***
     *
     * @param logoURI URL or Path Relative to the Base WHMCS Client Area Directory to a logo image file for this application.
     * @return This Payload, for chaining
     */
    public CreateOAuthCredentialPayload withLogoURI(String logoURI){
        put("logoUri", logoURI);
        return this;
    }

    /***
     *
     * @param redirectURI Authorised Redirect URIs
     * @return This Payload, for chaining
     */
    public CreateOAuthCredentialPayload withRedirectURI(String redirectURI){
        put("redirectUri", redirectURI);
        return this;
    }

}
