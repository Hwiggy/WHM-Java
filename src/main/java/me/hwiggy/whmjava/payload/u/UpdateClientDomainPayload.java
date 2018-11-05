package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateclientdomain/
 */
public class UpdateClientDomainPayload extends Payload {


    public UpdateClientDomainPayload(int domainid) {
        super("UpdateClientDomain");
        append("domainid", domainid);
    }

    /***
     *
     * @param dnsmanagement Enable/Disable DNS Management	
     */
    public UpdateClientDomainPayload withdnsmanagement(boolean dnsmanagement) {
        append("dnsmanagement", dnsmanagement);
        return this;
    }

    /***
     *
     * @param emailforwarding Enable/Disable Email Forwarding	
     */
    public UpdateClientDomainPayload withemailforwarding(boolean emailforwarding) {
        append("emailforwarding", emailforwarding);
        return this;
    }

    /***
     *
     * @param idprotection  Enable/Disable ID Protection	
     */
    public UpdateClientDomainPayload withidprotection(boolean idprotection) {
        append("idprotection", idprotection);
        return this;
    }

    /***
     *
     * @param donotrenew  Enable/Disable Do Not Renew	
     */
    public UpdateClientDomainPayload withdonotrenew(boolean donotrenew) {
        append("donotrenew", donotrenew);
        return this;
    }

    /***
     *
     * @param type  The type of domain order. (‘Register’, ‘Transfer’)	
     */
    public UpdateClientDomainPayload withtype(String type) {
        append("type", type);
        return this;
    }

    /***
     *
     * @param regdate  The registration date of the domain (Y-m-d)	
     */
    public UpdateClientDomainPayload withregdate(String regdate) {
        append("regdate", regdate);
        return this;
    }

    /***
     *
     * @param nextduedate  The next due date of the domain (Y-m-d)	
     */
    public UpdateClientDomainPayload withnextduedate(String nextduedate) {
        append("nextduedate", nextduedate);
        return this;
    }

    /***
     *
     * @param expirydate  The expiry date of the domain (Y-m-d)	
     */
    public UpdateClientDomainPayload withexpirydate(String expirydate) {
        append("expirydate", expirydate);
        return this;
    }

    /***
     *
     *@param domain  The domain name to be changed to	
     */
    public UpdateClientDomainPayload withdomain(String domain) {
        append("domain", domain);
        return this;
    }

    /***
     *
     *@param firstpaymentamount  The first payment amount on the domain	
     */
    public UpdateClientDomainPayload withfirstpaymentamount(float firstpaymentamount) {
        append("firstpaymentamount", firstpaymentamount);
        return this;
    }

    /***
     *
     *@param recurringamount  The recurring amount for automatic renewal invoices	
     */
    public UpdateClientDomainPayload withrecurringamount(float recurringamount) {
        append("recurringamount", recurringamount);
        return this;
    }

    /***
     *
     *@param registrar  The registrar to associate with the domain	
     */
    public UpdateClientDomainPayload withregistrar(String registrar) {
        append("registrar", registrar);
        return this;
    }

    /***
     *
     *@param regperiod  The registration period of the domain	
     */
    public UpdateClientDomainPayload withregperiod(int regperiod) {
        append("regperiod", regperiod);
        return this;
    }

    /***
     *
     *@param paymentmethod  The payment method to associate in system format (eg paypal)	
     */
    public UpdateClientDomainPayload withpaymentmethod(String paymentmethod) {
        append("paymentmethod", paymentmethod);
        return this;
    }

    /***
     *
     *@param subscriptionid  The subscription ID to associate with the domain	
     */
    public UpdateClientDomainPayload withsubscriptionid(String subscriptionid) {
        append("subscriptionid", subscriptionid);
        return this;
    }

    /***
     *
     *@param status  The status to change the domain to	
     */
    public UpdateClientDomainPayload withstatus(String status) {
        append("status", status);
        return this;
    }

    /***
     *
     *@param notes  The admin notes for the domain	
     */
    public UpdateClientDomainPayload withnotes(String notes) {
        append("notes", notes);
        return this;
    }

    /***
     *
     *@param promoid  The promotion Id to associate	
     */
    public UpdateClientDomainPayload withpromoid(int promoid) {
        append("promoid", promoid);
        return this;
    }

    /***
     *
     *@param autorecalc  Should the recurring amount of the domain be automatically recalculated (this will ignore any passed $recurringamount)	
     */
    public UpdateClientDomainPayload withautorecalc(boolean autorecalc) {
        append("autorecalc", autorecalc);
        return this;
    }

    /***
     *
     *@param updatens  Should the nameservers be updated at the registrar	
     */
    public UpdateClientDomainPayload withupdatens(boolean updatens) {
        append("updatens", updatens);
        return this;
    }

    /***
     *
     *@param ns1  The first nameserver to save	
     */
    public UpdateClientDomainPayload withns1(String ns1) {
        append("ns1", ns1);
        return this;
    }

    /***
     *
     *@param ns2  The second nameserver to save	
     */
    public UpdateClientDomainPayload withns2(String ns2) {
        append("ns2", ns2);
        return this;
    }

    /***
     *
     *@param ns3  The third nameserver to save	
     */
    public UpdateClientDomainPayload withns3(String ns3) {
        append("ns3", ns3);
        return this;
    }

    /***
     *
     *@param ns4  The fourth nameserver to save	
     */
    public UpdateClientDomainPayload withns4(String ns4) {
        append("ns4", ns4);
        return this;
    }

    /***
     *
     *@param ns5  The fifth nameserver to save	
     */
    public UpdateClientDomainPayload withns5(String ns5) {
        append("ns5", ns5);
        return this;
    }
}
