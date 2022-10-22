package me.hwiggy.whmjava.payload.c;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/closeclient/
 */
public class CloseClientPayload extends Payload {

    /***
     *
     * @param clientID The ID of the client to close
     */
    public CloseClientPayload(int clientID) {
        super("CloseClient");
        put("clientid", clientID);
    }
}
