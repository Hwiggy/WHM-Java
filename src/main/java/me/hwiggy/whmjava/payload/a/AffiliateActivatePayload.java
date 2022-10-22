package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/affiliateactivate/
 */
public class AffiliateActivatePayload extends Payload {

    /***
     *
     * @param userID The client ID to activate affiliate status for
     */
    public AffiliateActivatePayload(int userID) {
        super("AffiliateActivate");
        put("userid", userID);
    }
}
