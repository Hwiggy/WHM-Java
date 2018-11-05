package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateclientaddon/
 */
public class UpdateClientAddonPayload extends Payload {

    /***
     *
     * @param id The id of the client addon to update
     */
    public UpdateClientAddonPayload(int id ) {
        super("UpdateClientAddon");
        append("id", id);
    }

    /***
     * @param status
     */
    public UpdateClientAddonPayload withstatus(String status) {
        append("status", status);
        return this;
    }

    /***
     * @param terminationDate
     */
    public UpdateClientAddonPayload withterminationDate(String terminationDate) {
        append("terminationDate", terminationDate);
        return this;
    }

    /***
     * @param addonID
     */
    public UpdateClientAddonPayload withaddonID(int addonID) {
        append("addonid", addonID);
        return this;
    }

    /***
     * @param name
     */
    public UpdateClientAddonPayload witName(String name) {
        append("name", name);
        return this;
    }

    /***
     * @param setupfee
     */
    public UpdateClientAddonPayload withSetupFee(float setupFee) {
        append("setupfee", setupFee);
        return this;
    }

    /***
     * @param recurring
     */
    public UpdateClientAddonPayload withRecurring(float recurring) {
        append("recurring", recurring);
        return this;
    }

    /***
     * @param billingCycle
     */
    public UpdateClientAddonPayload withBillingCycle(String billingCycle) {
        append("billingcycle", billingCycle);
        return this;
    }

    /***
     * @param nextDueDate
     */
    public UpdateClientAddonPayload withNextDueDate(String nextDueDate) {
        append("nextduedate", nextDueDate);
        return this;
    }

    /***
     * @param nextInvoiceDate
     */
    public UpdateClientAddonPayload withNextInvoiceDate(String nextInvoiceDate) {
        append("nextinvoicedate", nextInvoiceDate);
        return this;
    }


    /***
     * @param notes
     */
    public UpdateClientAddonPayload withNotes(String notes) {
        append("notes", notes);
        return this;
    }

}
