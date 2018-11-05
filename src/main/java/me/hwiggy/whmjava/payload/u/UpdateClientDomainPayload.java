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
     * @param dnsManagement Enable/Disable DNS Management
     */
    public UpdateClientDomainPayload withDnsManagement(boolean dnsManagement) {
        append("dnsmanagement", dnsManagement);
        return this;
    }

    /***
     *
     * @param emailForwarding Enable/Disable Email Forwarding
     */
    public UpdateClientDomainPayload withEmailForwarding(boolean emailForwarding) {
        append("emailforwarding", emailForwarding);
        return this;
    }

    /***
     *
     * @param IDProtection  Enable/Disable ID Protection
     */
    public UpdateClientDomainPayload withIDProtection(boolean IDProtection) {
        append("idprotection", IDProtection);
        return this;
    }

    /***
     *
     * @param doNotRenew  Enable/Disable Do Not Renew
     */
    public UpdateClientDomainPayload withDoNotRenew(boolean doNotRenew) {
        append("donotrenew", doNotRenew);
        return this;
    }

    /***
     *
     * @param type  The type of domain order. (‘Register’, ‘Transfer’)	
     */
    public UpdateClientDomainPayload withType(String type) {
        append("type", type);
        return this;
    }

    /***
     *
     * @param regDate  The registration date of the domain (Y-m-d)
     */
    public UpdateClientDomainPayload withRegDate(String regDate) {
        append("regdate", regDate);
        return this;
    }

    /***
     *
     * @param nextDueDate  The next due date of the domain (Y-m-d)
     */
    public UpdateClientDomainPayload withNextDueDate(String nextDueDate) {
        append("nextduedate", nextDueDate);
        return this;
    }

    /***
     *
     * @param expiryDate  The expiry date of the domain (Y-m-d)
     */
    public UpdateClientDomainPayload withExpiryDate(String expiryDate) {
        append("expirydate", expiryDate);
        return this;
    }

    /***
     *
     *@param domain  The domain name to be changed to	
     */
    public UpdateClientDomainPayload withDomain(String domain) {
        append("domain", domain);
        return this;
    }

    /***
     *
     *@param FirstPaymentAmount  The first payment amount on the domain
     */
    public UpdateClientDomainPayload withFirstPaymentAmount(float FirstPaymentAmount) {
        append("firstpaymentamount", FirstPaymentAmount);
        return this;
    }

    /***
     *
     *@param recurringAmount  The recurring amount for automatic renewal invoices
     */
    public UpdateClientDomainPayload withRecurringAmount(float recurringAmount) {
        append("recurringamount", recurringAmount);
        return this;
    }

    /***
     *
     *@param registrar  The registrar to associate with the domain	
     */
    public UpdateClientDomainPayload withRegistrar(String registrar) {
        append("registrar", registrar);
        return this;
    }

    /***
     *
     *@param regPeriod  The registration period of the domain
     */
    public UpdateClientDomainPayload withRegPeriod(int regPeriod) {
        append("regperiod", regPeriod);
        return this;
    }

    /***
     *
     *@param paymentMethod  The payment method to associate in system format (eg paypal)
     */
    public UpdateClientDomainPayload withPaymentMethod(String paymentMethod) {
        append("paymentmethod", paymentMethod);
        return this;
    }

    /***
     *
     *@param subscriptionID  The subscription ID to associate with the domain
     */
    public UpdateClientDomainPayload withSubscriptionID(String subscriptionID) {
        append("subscriptionid", subscriptionID);
        return this;
    }

    /***
     *
     *@param status  The status to change the domain to	
     */
    public UpdateClientDomainPayload withStatus(String status) {
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
     *@param promoID  The promotion Id to associate
     */
    public UpdateClientDomainPayload withPromoID(int promoID) {
        append("promoid", promoID);
        return this;
    }

    /***
     *
     *@param autoRecalc  Should the recurring amount of the domain be automatically recalculated (this will ignore any passed $recurringamount)
     */
    public UpdateClientDomainPayload withAutoRecalc(boolean autoRecalc) {
        append("autorecalc", autoRecalc);
        return this;
    }

    /***
     *
     *@param updateNS  Should the nameservers be updated at the registrar
     */
    public UpdateClientDomainPayload withUpdateNS(boolean updateNS) {
        append("updatens", updateNS);
        return this;
    }

    /***
     *
     *@param ns1  The first nameserver to save	
     */
    public UpdateClientDomainPayload withNS1(String ns1) {
        append("ns1", ns1);
        return this;
    }

    /***
     *
     *@param ns2  The second nameserver to save	
     */
    public UpdateClientDomainPayload withNS2(String ns2) {
        append("ns2", ns2);
        return this;
    }

    /***
     *
     *@param ns3  The third nameserver to save	
     */
    public UpdateClientDomainPayload withNS3(String ns3) {
        append("ns3", ns3);
        return this;
    }

    /***
     *
     *@param ns4  The fourth nameserver to save	
     */
    public UpdateClientDomainPayload withNS4(String ns4) {
        append("ns4", ns4);
        return this;
    }

    /***
     *
     *@param ns5  The fifth nameserver to save	
     */
    public UpdateClientDomainPayload withNS5(String ns5) {
        append("ns5", ns5);
        return this;
    }
}
