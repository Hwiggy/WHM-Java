package me.hwiggy.whmjava.payload.d;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/deleteclient/
 */
public class DeleteClientPayload extends Payload {

    /***
     *
     * @param clientID The ID of the client to be deleted
     */
    public DeleteClientPayload(int clientID) {
        super("DeleteClient");
        put("clientid", clientID);
    }
}
