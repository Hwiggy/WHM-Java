package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/applycredit/
 */
public class ApplyCreditPayload extends Payload {

    /***
     *
     * @param invoiceID The ID of the invoice to apply credit
     * @param amount The amount of credit to apply to the invoice.
     */
    public ApplyCreditPayload(int invoiceID, float amount) {
        super("ApplyCredit");
        put("invoiceid", invoiceID);
        put("amount", amount);
    }

    /***
     *
     * @param noEmail Set to true to stop the invoice payment email being sent if the invoice becomes paid
     * @return This Payload, for chaining
     */
    public ApplyCreditPayload withNoEmail(boolean noEmail){
        put("noemail", noEmail);
        return this;
    }
}
