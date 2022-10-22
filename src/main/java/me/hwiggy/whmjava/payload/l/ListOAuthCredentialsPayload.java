package me.hwiggy.whmjava.payload.l;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/listoauthcredentials/
 */
public class ListOAuthCredentialsPayload extends Payload {

    public ListOAuthCredentialsPayload() {
        super("ListOAuthCredentials");
    }

    /***
     * @param grantType    Find credentials for a specific grant type	Optional
     */
    public ListOAuthCredentialsPayload withGrantType(String grantType) {
        put("grantType", grantType);
        return this;
    }

    /***
     * @param sortField    Sort the response using the passed field	Optional
     */
    public ListOAuthCredentialsPayload withSortField(String sortField) {
        put("sortField", sortField);
        return this;
    }

    /***
     * @param sortOrder    The direction of the sort order (‘ASC’, ‘DESC’)	Optional
     */
    public ListOAuthCredentialsPayload withSortOrder(String sortOrder) {
        put("sortOrder", sortOrder);
        return this;
    }

    /***
     * @param limit    To limit the number of returned credentials	Optional
     */
    public ListOAuthCredentialsPayload withLimit(int limit) {
        put("limit", limit);
        return this;
    }
}
