package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 * ￼* https://developers.whmcs.com/api-reference/geninvoices/
 */
public class GenInvoicesPayload extends Payload {
    public GenInvoicesPayload() {
        super("GetActivityLog");
    }

    /***
     * @param noEmails    Stop any invoice created emails being sent	Optional
     */
    public GenInvoicesPayload withNoEmails(boolean noEmails) {
        append("noemails", noEmails);
        return this;
    }

    /***
     * @param clientID    Pass to generate invoices only for a single client id	Optional
     */
    public GenInvoicesPayload withClientID(int clientID) {
        append("clientid", clientID);
        return this;
    }

    /***
     * @param serviceIDs    An array of service ids to generate invoices for	Optional
     */
    public GenInvoicesPayload withServiceIDs(int... serviceIDs) {
        append("serviceids", serviceIDs);
        return this;
    }

    /***
     * @param domainIDs    An array of domain ids to generate invoices for	Optional
     */
    public GenInvoicesPayload withDomainids(int... domainIDs) {
        append("domainids", domainIDs);
        return this;
    }

    /***
     * @param addonIDs    An array of addon ids to generate invoices for	Optional
     */
    public GenInvoicesPayload withAddonIDs(int... addonIDs) {
        append("addonids", addonIDs);
        return this;
    }

}
