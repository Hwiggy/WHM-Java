package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addbillableitem/
 */
public class AddBillableItemPayload extends Payload {

    /***
     *
     * @param clientID The client to add the item to
     * @param description The description of the Billable Item. This will appear on the invoice
     * @param amount The total amount to invoice for
     */
    public AddBillableItemPayload(int clientID, String description, float amount) {
        super("AddBillableItem");
        put("clientid", clientID);
        put("description", description);
        put("amount", amount);
    }

    /***
     *
     * @param invoiceAction One of ‘noinvoice’, ‘nextcron’, ‘nextinvoice’, ‘duedate’, ‘recur’
     * @return This Payload, for chaining
     */
    public AddBillableItemPayload withInvoiceAction(String invoiceAction){
        put("invoiceaction", invoiceAction);
        return this;
    }

    /***
     *
     * @param recur When invoiceaction=recur. The frequency of the recurrence.
     * @return This Payload, for chaining
     */
    public AddBillableItemPayload withRecur(int recur){
        put("recur", recur);
        return this;
    }

    /***
     *
     * @param recurCycle How often to recur the Billable Item. Days, Weeks, Months or Years.
     * @return This Payload, for chaining
     */
    public AddBillableItemPayload withRecurCycle(String recurCycle){
        put("recurcycle", recurCycle);
        return this;
    }

    /***
     *
     * @param recurFor How many times the Billable Item should create an invoice.
     * @return This Payload, for chaining
     */
    public AddBillableItemPayload withRecurFor(int recurFor){
        put("recurfor", recurFor);
        return this;
    }

    /***
     *
     * @param dueDate Date the invoice should be due (only required for duedate & recur invoice actions). YYYY-mm-dd
     * @return This Payload, for chaining
     */
    public AddBillableItemPayload withDueDate(String dueDate){
        put("duedate", dueDate);
        return this;
    }

    /***
     *
     * @param hours Number of hours/quantity the item corresponds to. (not required for single quantities)
     * @return This Payload, for chaining
     */
    public AddBillableItemPayload withHours(float hours){
        put("hours", hours);
        return this;
    }
}
