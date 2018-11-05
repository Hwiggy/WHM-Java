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
     * @param addonid
     */
    public UpdateClientAddonPayload withaddonid(int addonid) {
        append("addonid", addonid);
        return this;
    }

    /***
     * @param name
     */
    public UpdateClientAddonPayload withname(String name) {
        append("name", name);
        return this;
    }

    /***
     * @param setupfee
     */
    public UpdateClientAddonPayload withsetupfee(float setupfee) {
        append("setupfee", setupfee);
        return this;
    }

    /***
     * @param recurring
     */
    public UpdateClientAddonPayload withrecurring(float recurring) {
        append("recurring", recurring);
        return this;
    }

    /***
     * @param billingcycle
     */
    public UpdateClientAddonPayload withbillingcycle(String billingcycle) {
        append("billingcycle", billingcycle);
        return this;
    }

    /***
     * @param nextduedate
     */
    public UpdateClientAddonPayload withnextduedate(String nextduedate) {
        append("nextduedate", nextduedate);
        return this;
    }

    /***
     * @param nextinvoicedate
     */
    public UpdateClientAddonPayload withnextinvoicedate(String nextinvoicedate) {
        append("nextinvoicedate", nextinvoicedate);
        return this;
    }


    /***
     * @param notes
     */
    public UpdateClientAddonPayload withnotes(String notes) {
        append("notes", notes);
        return this;
    }

}
