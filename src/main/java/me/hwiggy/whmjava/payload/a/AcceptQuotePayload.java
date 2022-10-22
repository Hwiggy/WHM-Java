package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/acceptquote/
 */
public class AcceptQuotePayload extends Payload {

    /***
     *
     * @param quoteID The quote id to be accepted and converted to an invoice
     */
    AcceptQuotePayload(int quoteID) {
        super("AcceptQuote");
        put("quoteid", quoteID);
    }
}
