package me.hwiggy.whmjava.payload.s;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/starttasktimer/
 */
public class SendQuotePayload extends Payload {

    /***
     *
     * @param quoteid 	The id of the quote to send
     */
    public SendQuotePayload(int quoteid) {
        super("SendQuote");
        put("quoteid", quoteid);
    }
}
