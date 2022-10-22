package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addcredit/
 */
public class AddCreditPayload extends Payload {

    /***
     *
     * @param clientID The client ID to add credit for
     * @param description Admin only notes for credit justification
     * @param amount The amount of credit to add
     */
    public AddCreditPayload(int clientID, String description, float amount) {
        super("AddCredit");
        put("clientid", clientID);
        put("description", description);
        put("float", amount);
    }
}
