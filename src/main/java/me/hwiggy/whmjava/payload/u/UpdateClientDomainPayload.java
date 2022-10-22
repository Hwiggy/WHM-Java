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
        put("domainid", domainid);
    }

    /***
     *
     * @param dnsManagement Enable/Disable DNS Management
     */
    public UpdateClientDomainPayload withDnsManagement(boolean dnsManagement) {
        put("dnsmanagement", dnsManagement);
        return this;
    }

    /***
     *
     * @param emailForwarding Enable/Disable Email Forwarding
     */
    public UpdateClientDomainPayload withEmailForwarding(boolean emailForwarding) {
        put("emailforwarding", emailForwarding);
        return this;
    }

    /***
     *
     * @param IDProtection  Enable/Disable ID Protection
     */
    public UpdateClientDomainPayload withIDProtection(boolean IDProtection) {
        put("idprotection", IDProtection);
        return this;
    }

    /***
     *
     * @param doNotRenew  Enable/Disable Do Not Renew
     */
    public UpdateClientDomainPayload withDoNotRenew(boolean doNotRenew) {
        put("donotrenew", doNotRenew);
        return this;
    }

    /***
     *
     * @param type  The type of domain order. (‘Register’, ‘Transfer’)	
     */
    public UpdateClientDomainPayload withType(String type) {
        put("type", type);
        return this;
    }

    /***
     *
     * @param regDate  The registration date of the domain (Y-m-d)
     */
    public UpdateClientDomainPayload withRegDate(String regDate) {
        put("regdate", regDate);
        return this;
    }

    /***
     *
     * @param nextDueDate  The next due date of the domain (Y-m-d)
     */
    public UpdateClientDomainPayload withNextDueDate(String nextDueDate) {
        put("nextduedate", nextDueDate);
        return this;
    }

    /***
     *
     * @param expiryDate  The expiry date of the domain (Y-m-d)
     */
    public UpdateClientDomainPayload withExpiryDate(String expiryDate) {
        put("expirydate", expiryDate);
        return this;
    }

    /***
     *
     *@param domain  The domain name to be changed to	
     */
    public UpdateClientDomainPayload withDomain(String domain) {
        put("domain", domain);
        return this;
    }

    /***
     *
     *@param FirstPaymentAmount  The first payment amount on the domain
     */
    public UpdateClientDomainPayload withFirstPaymentAmount(float FirstPaymentAmount) {
        put("firstpaymentamount", FirstPaymentAmount);
        return this;
    }

    /***
     *
     *@param recurringAmount  The recurring amount for automatic renewal invoices
     */
    public UpdateClientDomainPayload withRecurringAmount(float recurringAmount) {
        put("recurringamount", recurringAmount);
        return this;
    }

    /***
     *
     *@param registrar  The registrar to associate with the domain	
     */
    public UpdateClientDomainPayload withRegistrar(String registrar) {
        put("registrar", registrar);
        return this;
    }

    /***
     *
     *@param regPeriod  The registration period of the domain
     */
    public UpdateClientDomainPayload withRegPeriod(int regPeriod) {
        put("regperiod", regPeriod);
        return this;
    }

    /***
     *
     *@param paymentMethod  The payment method to associate in system format (eg paypal)
     */
    public UpdateClientDomainPayload withPaymentMethod(String paymentMethod) {
        put("paymentmethod", paymentMethod);
        return this;
    }

    /***
     *
     *@param subscriptionID  The subscription ID to associate with the domain
     */
    public UpdateClientDomainPayload withSubscriptionID(String subscriptionID) {
        put("subscriptionid", subscriptionID);
        return this;
    }

    /***
     *
     *@param status  The status to change the domain to	
     */
    public UpdateClientDomainPayload withStatus(String status) {
        put("status", status);
        return this;
    }

    /***
     *
     *@param notes  The admin notes for the domain	
     */
    public UpdateClientDomainPayload withnotes(String notes) {
        put("notes", notes);
        return this;
    }

    /***
     *
     *@param promoID  The promotion Id to associate
     */
    public UpdateClientDomainPayload withPromoID(int promoID) {
        put("promoid", promoID);
        return this;
    }

    /***
     *
     *@param autoRecalc  Should the recurring amount of the domain be automatically recalculated (this will ignore any passed $recurringamount)
     */
    public UpdateClientDomainPayload withAutoRecalc(boolean autoRecalc) {
        put("autorecalc", autoRecalc);
        return this;
    }

    /***
     *
     *@param updateNS  Should the nameservers be updated at the registrar
     */
    public UpdateClientDomainPayload withUpdateNS(boolean updateNS) {
        put("updatens", updateNS);
        return this;
    }

    /***
     *
     *@param ns1  The first nameserver to save	
     */
    public UpdateClientDomainPayload withNS1(String ns1) {
        put("ns1", ns1);
        return this;
    }

    /***
     *
     *@param ns2  The second nameserver to save	
     */
    public UpdateClientDomainPayload withNS2(String ns2) {
        put("ns2", ns2);
        return this;
    }

    /***
     *
     *@param ns3  The third nameserver to save	
     */
    public UpdateClientDomainPayload withNS3(String ns3) {
        put("ns3", ns3);
        return this;
    }

    /***
     *
     *@param ns4  The fourth nameserver to save	
     */
    public UpdateClientDomainPayload withNS4(String ns4) {
        put("ns4", ns4);
        return this;
    }

    /***
     *
     *@param ns5  The fifth nameserver to save	
     */
    public UpdateClientDomainPayload withNS5(String ns5) {
        put("ns5", ns5);
        return this;
    }
}
