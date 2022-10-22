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
        put("id", id);
    }

    /***
     * @param status
     */
    public UpdateClientAddonPayload withstatus(String status) {
        put("status", status);
        return this;
    }

    /***
     * @param terminationDate
     */
    public UpdateClientAddonPayload withterminationDate(String terminationDate) {
        put("terminationDate", terminationDate);
        return this;
    }

    /***
     * @param addonID
     */
    public UpdateClientAddonPayload withaddonID(int addonID) {
        put("addonid", addonID);
        return this;
    }

    /***
     * @param name
     */
    public UpdateClientAddonPayload witName(String name) {
        put("name", name);
        return this;
    }

    /***
     * @param setupFee
     */
    public UpdateClientAddonPayload withSetupFee(float setupFee) {
        put("setupfee", setupFee);
        return this;
    }

    /***
     * @param recurring
     */
    public UpdateClientAddonPayload withRecurring(float recurring) {
        put("recurring", recurring);
        return this;
    }

    /***
     * @param billingCycle
     */
    public UpdateClientAddonPayload withBillingCycle(String billingCycle) {
        put("billingcycle", billingCycle);
        return this;
    }

    /***
     * @param nextDueDate
     */
    public UpdateClientAddonPayload withNextDueDate(String nextDueDate) {
        put("nextduedate", nextDueDate);
        return this;
    }

    /***
     * @param nextInvoiceDate
     */
    public UpdateClientAddonPayload withNextInvoiceDate(String nextInvoiceDate) {
        put("nextinvoicedate", nextInvoiceDate);
        return this;
    }


    /***
     * @param notes
     */
    public UpdateClientAddonPayload withNotes(String notes) {
        put("notes", notes);
        return this;
    }

}
