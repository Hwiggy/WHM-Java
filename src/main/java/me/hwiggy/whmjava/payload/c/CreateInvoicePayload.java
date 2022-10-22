package me.hwiggy.whmjava.payload.c;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/createinvoice/
 */
public class CreateInvoicePayload extends Payload {

    /***
     *
     * @param userID The ID of the client to invoice
     */
    public CreateInvoicePayload(int userID) {
        super("CreateInvoice");
        put("userid", userID);
    }

    /***
     *
     * @param status The status of the invoice being created (Defaults to Unpaid)
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withStatus(String status){
        put("status", status);
        return this;
    }

    /***
     *
     * @param draft Should the invoice be created in draft status (No need to pass $status also)
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withDraft(boolean draft){
        put("draft", draft);
        return this;
    }

    /***
     *
     * @param sendInvoice Should the Invoice Created Email be sent to the client (cannot be used with $draft)
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withSendInvoice(boolean sendInvoice){
        put("sendinvoice", sendInvoice);
        return this;
    }

    /***
     *
     * @param paymentMethod The payment method of the created invoice in system format
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withPaymentMethod(String paymentMethod){
        put("paymentmethod", paymentMethod);
        return this;
    }

    /***
     *
     * @param taxRate The first level tax rate to apply to the invoice to override the system default
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withTaxRate(float taxRate){
        put("taxrate", taxRate);
        return this;
    }

    /***
     *
     * @param taxRateTwo The second level tax rate to apply to the invoice to override the system default
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withTaxRateTwo(float taxRateTwo){
        put("taxrate2", taxRateTwo);
        return this;
    }

    /***
     *
     * @param date The date that the invoice should show as created YYYY-mm-dd
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withDate(String date){
        put("date", date);
        return this;
    }

    /***
     *
     * @param dueDate The due date of the newly created invoice YYYY-mm-dd
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withDueDate(String dueDate){
        put("duedate", dueDate);
        return this;
    }

    /***
     *
     * @param notes The notes to appear on the created invoice
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withNotes(String notes){
        put("notes", notes);
        return this;
    }

    /***
     *
     * @param itemDescriptions Descriptions of items to add to the invoice
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withItemDescriptions(String... itemDescriptions){
        int ct = 1;
        for (String desc : itemDescriptions){
            put("itemdescription" + ct, desc);
            ct++;
        }
        return this;
    }

    /***
     *
     * @param itemAmounts Price amounts of items to add to the invoice
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withItemAmounts(float... itemAmounts){
        int ct = 1;
        for (float amount : itemAmounts){
            put("itemamount" + ct, amount);
            ct++;
        }
        return this;
    }

    /***
     *
     * @param itemTaxed Whether each item added to the invoice includes the tax
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withitemTaxed(boolean... itemTaxed){
        int ct = 1;
        for (boolean taxed : itemTaxed){
            put("itemtaxed" + ct, taxed);
            ct++;
        }
        return this;
    }

    /***
     *
     * @param autoApplyCredit Should credit on the client account be automatically applied to the invoice
     * @return This Payload, for chaining
     */
    public CreateInvoicePayload withAutoApplyCredit(boolean autoApplyCredit){
        put("autoapplycredit", autoApplyCredit);
        return this;
    }
}
