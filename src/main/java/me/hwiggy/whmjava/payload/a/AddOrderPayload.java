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
        put("pid", pids);
        return this;
    }

    /***
     *
     * @param domains The array of domain names associated with the products/domains
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomains(String... domains){
        put("domain", domains);
        return this;
    }

    /***
     *
     * @param billingCycles The array of billing cycles for the products
     * @return This Payload, for chaining
     */
    public AddOrderPayload withBillingCycles(String... billingCycles){
        put("billingcycle", billingCycles);
        return this;
    }

    /***
     *
     * @param domainTypes For domain registrations, an array of register or transfer values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainTypes(String... domainTypes){
        put("domaintype", domainTypes);
        return this;
    }

    /***
     *
     * @param regPeriods For domain registrations, the registration periods for the domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withRegPeriods(int... regPeriods){
        put("regperiod", regPeriods);
        return this;
    }

    /***
     *
     * @param eppCodes For domain transfers. The epp codes for the domains being transferred in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withEppCodes(String... eppCodes){
        put("eppcode", eppCodes);
        return this;
    }

    /***
     *
     * @param nameserverOne The first nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverOne(String nameserverOne){
        put("nameserver1", nameserverOne);
        return this;
    }

    /***
     *
     * @param nameserverTwo The second nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverTwo(String nameserverTwo){
        put("nameserver2", nameserverTwo);
        return this;
    }

    /***
     *
     * @param nameserverThree The third nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverThree(String nameserverThree){
        put("nameserver3", nameserverThree);
        return this;
    }

    /***
     *
     * @param nameserverFour The fourth nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverFour(String nameserverFour){
        put("nameserver4", nameserverFour);
        return this;
    }

    /***
     *
     * @param nameserverFive The fifth nameserver to apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNameserverFive(String nameserverFive){
        put("nameserver5", nameserverFive);
        return this;
    }

    /***
     *
     * @param customFields An array of base64 encoded serialized array of product custom field values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withCustomFields(String... customFields){
        put("customfields", customFields);
        return this;
    }

    /***
     *
     * @param configOptions An array of base64 encoded serialized array of product configurable options values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withConfigOptions(String... configOptions){
        put("configoptions", configOptions);
        return this;
    }

    /***
     *
     * @param priceOverrides Override the price of the product being ordered
     * @return This Payload, for chaining
     */
    public AddOrderPayload withPriceOverrides(float... priceOverrides){
        put("priceoverrides", priceOverrides);
        return this;
    }

    /***
     *
     * @param promoCode The promotion code to apply to the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withPromoCode(String promoCode){
        put("promocode", promoCode);
        return this;
    }

    /***
     *
     * @param promoOverride Should the promotion apply to the order even without matching promotional products
     * @return This Payload, for chaining
     */
    public AddOrderPayload withPromoOverride(boolean promoOverride){
        put("promooverride", promoOverride);
        return this;
    }

    /***
     *
     * @param affID The affiliate id to associate with the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAffID(int affID){
        put("affid", affID);
        return this;
    }

    /***
     *
     * @param noInvoice Set to true to suppress the invoice generating for the whole order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNoInvoice(boolean noInvoice){
        put("noinvoice", noInvoice);
        return this;
    }

    /***
     *
     * @param noInvoiceEmail Set to true to suppress the Invoice Created email being sent for the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNoInvoiceEmail(boolean noInvoiceEmail){
        put("noinvoiceemail", noInvoiceEmail);
        return this;
    }

    /***
     *
     * @param noEmail Set to true to suppress the Order Confirmation email being sent
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNoEmail(boolean noEmail){
        put("noemail", noEmail);
        return this;
    }

    /***
     *
     * @param addons A comma separated list of addons to create on order with the products
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAddons(String... addons){
        put("addons", addons);
        return this;
    }

    /***
     *
     * @param hostnames The hostnames of the servers for VPS/Dedicated Server orders
     * @return This Payload, for chaining
     */
    public AddOrderPayload withHostnames(String... hostnames){
        put("hostname", hostnames);
        return this;
    }

    /***
     *
     * @param ns1Prefixes The first nameserver prefix for the VPS/Dedicated servers. Eg. ns1 in ns1.hostname.com
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNS1Prefixes(String... ns1Prefixes){
        put("ns1prefix", ns1Prefixes);
        return this;
    }

    /***
     *
     * @param ns2Prefixes The second nameserver prefix for the VPS/Dedicated servers. Eg. ns2 in ns2.hostname.com
     * @return This Payload, for chaining
     */
    public AddOrderPayload withNS2Prefixes(String... ns2Prefixes){
        put("ns2prefix", ns2Prefixes);
        return this;
    }

    /***
     *
     * @param rootPw The root password for the VPS/Dedicated server.
     * @return This Payload, for chaining
     */
    public AddOrderPayload withRootPw(String rootPw){
        put("rootps", rootPw);
        return this;
    }

    /***
     *
     * @param contactID The id of the contact, associated with the client, that should apply to all domains in the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withContactID(int contactID){
        put("contactid", contactID);
        return this;
    }

    /***
     *
     * @param dnsManagement Add DNS Management to the Domain Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDNSManagement(boolean... dnsManagement){
        put("dnsmanagement", dnsManagement);
        return this;
    }

    /***
     *
     * @param domainFields An array of base64 encoded serialized array of TLD Specific Field Values
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainFields(String... domainFields){
        put("domainfields", domainFields);
        return this;
    }

    /***
     *
     * @param emailForwarding Add Email Forwarding to the Domain Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withEmailForwardings(boolean... emailForwarding){
        put("emailforwarding", emailForwarding);
        return this;
    }

    /***
     *
     * @param idProtections Add ID Protection to the Domain Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withIDProtections(boolean... idProtections){
        put("idprotection", idProtections);
        return this;
    }

    /***
     *
     * @param domainPriceOverrides Override the price of the registration price on the domain being ordered
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainPriceOverrides(float... domainPriceOverrides){
        put("domainpriceoverride", domainPriceOverrides);
        return this;
    }

    /***
     *
     * @param domainRenewOverrides Override the price of the renewal price on the domain being ordered
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainRenewOverrides(float... domainRenewOverrides){
        put("domainrenewoverride", domainRenewOverrides);
        return this;
    }

    /***
     *
     * @param domainRenewals A name -> value array of $domainName -> $renewalPeriod renewals to add an order for
     * @return This Payload, for chaining
     */
    public AddOrderPayload withDomainRenewals(JSONObject domainRenewals){
        put("domainrenewals", domainRenewals);
        return this;
    }

    /***
     *
     * @param clientIP The ip address to associate with the order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withClientIP(String clientIP){
        put("clientip", clientIP);
        return this;
    }

    /***
     *
     * @param addonID The Addon ID for an Addon Only Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAddonID(int addonID){
        put("addonid", addonID);
        return this;
    }

    /***
     *
     * @param serviceID The service ID for the addon only order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withServiceID(int serviceID){
        put("serviceid", serviceID);
        return this;
    }

    /***
     *
     * @param addonIDs An Array of addon ids for an Addon Only Order
     * @return This Payload, for chaining
     */
    public AddOrderPayload withAddonIDs(int... addonIDs){
        put("addonids", addonIDs);
        return this;
    }

    /***
     *
     * @param serviceIDs An array of service ids to associate the addons for an Addon Only order
     * @return  This Payload, for chaining
     */
    public AddOrderPayload withServiceIDs(int... serviceIDs){
        put("serviceids", serviceIDs);
        return this;
    }
}
