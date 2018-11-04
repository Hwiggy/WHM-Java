package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addorder/
 */
public class AddOrderPayload extends Payload {

    /***
     *
     * @param clientID The client ID to add an order for
     * @param paymentMethod The payment method for the order in the system format. eg. paypal, mailin
     */
    public AddOrderPayload(int clientID, String paymentMethod) {
        super("AddOrder");
    }

    /***
     *
     * @param pids The array of product ids to add the order for
     * @return This Payload, for chaining
     */
    public AddOrderPayload withPIDs(int... pids){
        append("pid", pids);
        return this;
    }

    /***
     *
     * @param domains The array of domain names associated with the products/domains
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomains(String... domains){
        append("domain", domains);
        return this;
    }

    /***
     *
     * @param billingCycles The array of billing cycles for the products
     * @return This Payload, for chaining
     */
    public AddOrderPayload withBillingCycles(String... billingCycles){
        append("billingcycle", billingCycles);
        return this;
    }

    /***
     *
     * @param domainTypes For domain registrations, an array of register or transfer values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainTypes(String... domainTypes){
        append("domaintype", domainTypes);
        return this;
    }

    /***
     *
     * @param regPeriods For domain registrations, the registration periods for the domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withRegPeriods(int... regPeriods){
        append("regperiod", regPeriods);
        return this;
    }

    /***
     *
     * @param eppCodes For domain transfers. The epp codes for the domains being transferred in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withEppCodes(String... eppCodes){
        append("eppcode", eppCodes);
        return this;
    }

    /***
     *
     * @param nameserverOne The first nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverOne(String nameserverOne){
        append("nameserver1", nameserverOne);
        return this;
    }

    /***
     *
     * @param nameserverTwo The second nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverTwo(String nameserverTwo){
        append("nameserver2", nameserverTwo);
        return this;
    }

    /***
     *
     * @param nameserverThree The third nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverThree(String nameserverThree){
        append("nameserver3", nameserverThree);
        return this;
    }

    /***
     *
     * @param nameserverFour The fourth nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverFour(String nameserverFour){
        append("nameserver4", nameserverFour);
        return this;
    }

    /***
     *
     * @param nameserverFive The fifth nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverFive(String nameserverFive){
        append("nameserver5", nameserverFive);
        return this;
    }

    /***
     *
     * @param customFields An array of base64 encoded serialized array of product custom field values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withCustomFields(String... customFields){
        append("customfields", customFields);
        return this;
    }

    /***
     *
     * @param configOptions An array of base64 encoded serialized array of product configurable options values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withConfigOptions(String... configOptions){
        append("configoptions", configOptions);
        return this;
    }

    /***
     *
     * @param priceOverrides Override the price of the product being ordered
     * @return This Payload, for chaining
     */
    public AddOrderPayload withPriceOverrides(float... priceOverrides){
        append("priceoverrides", priceOverrides);
        return this;
    }

    /***
     *
     * @param promoCode The promotion code to apply to the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withPromoCode(String promoCode){
        append("promocode", promoCode);
        return this;
    }

    /***
     *
     * @param promoOverride Should the promotion apply to the order even without matching promotional products
     * @return This Payload, for chaining
     */
    public AddOrderPayload withPromoOverride(boolean promoOverride){
        append("promooverride", promoOverride);
        return this;
    }

    /***
     *
     * @param affID The affiliate id to associate with the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAffID(int affID){
        append("affid", affID);
        return this;
    }

    /***
     *
     * @param noInvoice Set to true to suppress the invoice generating for the whole order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNoInvoice(boolean noInvoice){
        append("noinvoice", noInvoice);
        return this;
    }

    /***
     *
     * @param noInvoiceEmail Set to true to suppress the Invoice Created email being sent for the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNoInvoiceEmail(boolean noInvoiceEmail){
        append("noinvoiceemail", noInvoiceEmail);
        return this;
    }

    /***
     *
     * @param noEmail Set to true to suppress the Order Confirmation email being sent
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNoEmail(boolean noEmail){
        append("noemail", noEmail);
        return this;
    }

    /***
     *
     * @param addons A comma separated list of addons to create on order with the products
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAddons(String... addons){
        append("addons", addons);
        return this;
    }

    /***
     *
     * @param hostnames The hostnames of the servers for VPS/Dedicated Server orders
     * @return This Payload, for chaining
     */
    public AddOrderPayload withHostnames(String... hostnames){
        append("hostname", hostnames);
        return this;
    }

    /***
     *
     * @param ns1Prefixes The first nameserver prefix for the VPS/Dedicated servers. Eg. ns1 in ns1.hostname.com
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNS1Prefixes(String... ns1Prefixes){
        append("ns1prefix", ns1Prefixes);
        return this;
    }

    /***
     *
     * @param ns2Prefixes The second nameserver prefix for the VPS/Dedicated servers. Eg. ns2 in ns2.hostname.com
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNS2Prefixes(String... ns2Prefixes){
        append("ns2prefix", ns2Prefixes);
        return this;
    }

    /***
     *
     * @param rootPw The root password for the VPS/Dedicated server.
     * @return This Payload, for chaining
     */
    public AddOrderPayload withRootPw(String rootPw){
        append("rootps", rootPw);
        return this;
    }

    /***
     *
     * @param contactID The id of the contact, associated with the client, that should apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withContactID(int contactID){
        append("contactid", contactID);
        return this;
    }

    /***
     *
     * @param dnsManagement Add DNS Management to the Domain Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDNSManagement(boolean... dnsManagement){
        append("dnsmanagement", dnsManagement);
        return this;
    }

    /***
     *
     * @param domainFields An array of base64 encoded serialized array of TLD Specific Field Values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainFields(String... domainFields){
        append("domainfields", domainFields);
        return this;
    }

    /***
     *
     * @param emailForwarding Add Email Forwarding to the Domain Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withEmailForwardings(boolean... emailForwarding){
        append("emailforwarding", emailForwarding);
        return this;
    }

    /***
     *
     * @param idProtections Add ID Protection to the Domain Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withIDProtections(boolean... idProtections){
        append("idprotection", idProtections);
        return this;
    }

    /***
     *
     * @param domainPriceOverrides Override the price of the registration price on the domain being ordered
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainPriceOverrides(float... domainPriceOverrides){
        append("domainpriceoverride", domainPriceOverrides);
        return this;
    }

    /***
     *
     * @param domainRenewOverrides Override the price of the renewal price on the domain being ordered
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainRenewOverrides(float... domainRenewOverrides){
        append("domainrenewoverride", domainRenewOverrides);
        return this;
    }

    /***
     *
     * @param domainRenewals A name -> value array of $domainName -> $renewalPeriod renewals to add an order for
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainRenewals(JSONObject domainRenewals){
        append("domainrenewals", domainRenewals);
        return this;
    }

    /***
     *
     * @param clientIP The ip address to associate with the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withClientIP(String clientIP){
        append("clientip", clientIP);
        return this;
    }

    /***
     *
     * @param addonID The Addon ID for an Addon Only Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAddonID(int addonID){
        append("addonid", addonID);
        return this;
    }

    /***
     *
     * @param serviceID The service ID for the addon only order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withServiceID(int serviceID){
        append("serviceid", serviceID);
        return this;
    }

    /***
     *
     * @param addonIDs An Array of addon ids for an Addon Only Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAddonIDs(int... addonIDs){
        append("addonids", addonIDs);
        return this;
    }

    /***
     *
     * @param serviceIDs An array of service ids to associate the addons for an Addon Only order
     * @return  This Payload, for chaining
     */
    public AddOrderPayload withServiceIDs(int... serviceIDs){
        append("serviceids", serviceIDs);
        return this;
    }
}
