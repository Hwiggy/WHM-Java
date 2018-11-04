package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateinvoice/
 */
public class UpdateInvoicePayload extends Payload {

    /***
     *
     * @param invoiceID The ID of the invoice to update
     */

    public UpdateInvoicePayload(int invoiceID) {
        super("UpdateInvoice");
        append("invoiceid", invoiceID);
    }

    /***
     *
     * @param status The status of the invoice being
     */
    public UpdateInvoicePayload withStatus(String status) {
        append("status", status);
        return this;
    }

    /***
     *
     * @param paymentMethod The payment method of the invoice in system format
     */
    public UpdateInvoicePayload withPaymentMethod(String paymentMethod) {
        append("paymentmethod", paymentMethod);
        return this;
    }

    /***
     *
     * @param taxRate The first level tax rate to apply to the invoice to override the system default
     */
    public UpdateInvoicePayload withTaxRate(float taxRate) {
        append("taxrate", taxRate);
        return this;
    }

    /***
     *
     * @param taxrate2 The second level tax rate to apply to the invoice to override the system default
     */
    public UpdateInvoicePayload withTaxRate2(float taxrate2) {
        append("taxrate2", taxrate2);
        return this;
    }

    /***
     *
     * @param subTotal Update the subtotal of the invoice
     */
    public UpdateInvoicePayload withSubTotal(float subTotal) {
        append("subtotal", subTotal);
        return this;
    }

    /***
     *
     * @param total Update the total of the invoice
     */
    public UpdateInvoicePayload withTotal(float total) {
        append("total", total);
        return this;
    }

    /***
     *
     * @param credit Update the credit applied to the invoice
     */
    public UpdateInvoicePayload withCredit(float credit) {
        append("credit", credit);
        return this;
    }

    /***
     *
     * @param date The date that the invoice should show as created YYYY-mm-dd
     */
    public UpdateInvoicePayload withDate(String date) {
        append("date", date);
        return this;
    }

    /***
     *
     * @param duedate The due date of the invoice YYYY-mm-dd
     */
    public UpdateInvoicePayload withDueDate(String duedate) {
        append("duedate", duedate);
        return this;
    }

    /***
     *
     * @param datepaid The date paid of the invoice YYYY-mm-dd
     */
    public UpdateInvoicePayload withDatePaid(String datepaid) {
        append("datepaid", datepaid);
        return this;
    }

    /***
     *
     * @param notes The notes to appear on the invoice
     */
    public UpdateInvoicePayload withNotes(String notes) {
        append("notes", notes);
        return this;
    }

    /***
     *
     * @param itemdescription An array of lineItemId => Description of items to change
     */
    public UpdateInvoicePayload withItemDescription(String... itemdescription) {
        append("itemdescription", itemdescription);
        return this;
    }

    /***
     *
     * @param itemamount An array of lineItemId => amount of items to change
     */
    public UpdateInvoicePayload withItemAmount(float... itemamount) {
        append("itemamount", itemamount);
        return this;
    }

    /***
     *
     * @param itemtaxed An array of lineItemId => taxed of items to change
     */
    public UpdateInvoicePayload withItemTaxed(boolean... itemtaxed) {
        append("itemtaxed", itemtaxed);
        return this;
    }

    /***
     *
     * @param newItemDescription The line items description
     */
    public UpdateInvoicePayload withNewItemDescription(String... newItemDescription) {
        append("newitemdescription", newItemDescription);
        return this;
    }

    /***
     *
     * @param newitemamount The line items amount
     */
    public UpdateInvoicePayload withNewItemTotal(float... newitemamount) {
        append("newitemamount", newitemamount);
        return this;
    }

    /***
     *
     * @param newitemtaxed The line items is taxed value
     */
    public UpdateInvoicePayload withNewItemTxed(boolean... newitemtaxed) {
        append("newitemtaxed", newitemtaxed);
        return this;
    }

    /***
     *
     * @param deletelineids An array of line item ids to remove from the invoice
     */
    public UpdateInvoicePayload withDeleteLineIDs(int... deletelineids) {
        append("deletelineids", deletelineids);
        return this;
    }

    /***
     *
     * @param publish An array of line item ids to remove from the invoice
     */
    public UpdateInvoicePayload withPublish(boolean publish) {
        append("publish", publish);
        return this;
    }

    /***
     *
     * @param publishAndSendEmails Publish and email the invoice
     */
    public UpdateInvoicePayload withPublishAndSendEmails(boolean publishAndSendEmails) {
        append("publishandsendemail", publishAndSendEmails);
        return this;
    }
}
