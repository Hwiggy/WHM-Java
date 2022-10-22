package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addcancelrequest/
 */
public class AddCancelRequestPayload extends Payload {

    /***
     *
     * @param serviceID The Service ID to cancel
     */
    public AddCancelRequestPayload(int serviceID) {
        super("AddCancelRequest");
        put("serviceid", serviceID);
    }

    /***
     *
     * @param type The type of cancellation. ‘Immediate’ or ‘End of Billing Period’
     * @return This Payload, for chaining
     */
    public AddCancelRequestPayload withType(String type){
        put("type", type);
        return this;
    }

    /***
     *
     * @param reason The customer reason for cancellation
     * @return This Payload, for chaining
     */
    public AddCancelRequestPayload withReason(String reason){
        put("reason", reason);
        return this;
    }
}
