package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addtransaction/
 */
public class AddTransactionPayload extends Payload {

    /***
     *
     * @param paymentMethod The payment method of the transaction in system format
     */
    public AddTransactionPayload(String paymentMethod) {
        super("AddTransaciton");
        append("paymentmethod", paymentMethod);
    }

    /***
     *
     * @param userID The ID of the user to apply the transaction to
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withUserID(int userID){
        append("userid", userID);
        return this;
    }

    /***
     *
     * @param invoiceID The ID of the invoice the transaction is for
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withInvoiceID(int invoiceID){
        append("invoiceid", invoiceID);
        return this;
    }

    /***
     *
     * @param transID The unique transaction id for this payment
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withTransID(String transID){
        append("transid", transID);
        return this;
    }

    /***
     *
     * @param date The date of the transaction in your Localisation Format (eg DD/MM/YYYY)
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withDate(String date){
        append("date", date);
        return this;
    }

    /***
     *
     * @param currencyID The currency id for the transaction if not associated with a user
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withCurrencyID(int currencyID){
        append("currencyid", currencyID);
        return this;
    }

    /***
     *
     * @param description The description of the transaction
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withDescription(String description){
        append("description", description);
        return this;
    }

    /***
     *
     * @param amountIn The amount received by the payment
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withAmountIn(float amountIn){
        append("amountin", amountIn);
        return this;
    }

    /***
     *
     * @param fees The amount of fee charged on the transaction by the merchant - This can be negative
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withFees(float fees){
        append("fees", fees);
        return this;
    }

    /***
     *
     * @param amountOut The amount paid out by the payment
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withAmountOut(float amountOut){
        append("amountout", amountOut);
        return this;
    }

    /***
     *
     * @param rate The exchange rate for the payment based on the default currency
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withRate(float rate){
        append("rate", rate);
        return this;
    }

    /***
     *
     * @param credit Should the payment be applied to credit on the client account. Invoice ID must not be provided.
     * @return This Payload, for chaining
     */
    public AddTransactionPayload withCredit(boolean credit){
        append("credit", credit);
        return this;
    }
}
