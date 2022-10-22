package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/getticketpredefinedreplies/
 */
public class GetTicketPredefinedRepliesPayload extends Payload {

    public GetTicketPredefinedRepliesPayload() {
        super("GetTicketPredefinedReplies");
    }

    /***
     *
     * @param catID Obtain predefined replies for a specific category id
     */
    public GetTicketPredefinedRepliesPayload withCatID(int catID) {
        put("catid", catID);
        return this;
    }
}
