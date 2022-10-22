package me.hwiggy.whmjava.payload.p;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/pendingorder/
 */
public class PendingOrderPayload extends Payload {

    /***
     *
     * @param orderID The order id to be accepted
     */
    public PendingOrderPayload(int orderID) {
        super("PendingOrder");
        put("orderid", orderID);
    }
}
