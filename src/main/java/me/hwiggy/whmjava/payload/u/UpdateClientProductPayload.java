package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

import javax.print.DocFlavor;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateclientproduct/
 */
public class UpdateClientProductPayload extends Payload {

    /***
     *
     * @param serviceID
     */
    public UpdateClientProductPayload(int serviceID) {
        super("UpdateClientProduct");
        put("serviceid", serviceID);
    }


    /***
     *
     * @param PID  The package id to associate with the service
     */
    public UpdateClientProductPayload withPID(int PID) {
        put("pid", PID);
        return this;
    }

    /***
     *
     * @param serverID  The server id to associate with the service
     */
    public UpdateClientProductPayload withServerID(int serverID) {
        put("serverid", serverID);
        return this;
    }

    /***
     *
     * @param nextDueDate  The next due date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withNextDueDate(String nextDueDate) {
        put("nextduedate", nextDueDate);
        return this;
    }

    /***
     *
     * @param terminationDate  Update the termination date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withTerminationDate(String terminationDate) {
        put("terminationDate", terminationDate);
        return this;
    }

    /***
     *
     * @param completedDate  Update the completed date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withCompletedDate(String completedDate) {
        put("completedDate", completedDate);
        return this;
    }

    /***
     *
     * @param domain The domain name to be changed to
     */
    public UpdateClientProductPayload withDomain(String domain) {
        put("domain", domain);
        return this;
    }

    /***
     *
     * @param firstPaymentAmount The first payment amount on the service
     */
    public UpdateClientProductPayload withFirstPaymentAmount(float firstPaymentAmount) {
        put("firstpaymentamount", firstPaymentAmount);
        return this;
    }

    /***
     *
     * @param reccuringAmount The recurring amount for automatic renewal invoices
     */
    public UpdateClientProductPayload withReccuringAmount(float reccuringAmount) {
        put("recurringamount",reccuringAmount);
        return this;
    }

    /***
     *
     * @param paymentMethod The payment method to associate in system format (eg paypal)
     */
    public UpdateClientProductPayload withPaymentMethod(String paymentMethod) {
        put("paymentmethod", paymentMethod);
        return this;
    }

    /***
     *
     * @param subscriptionid The subscription ID to associate with the service
     */
    public UpdateClientProductPayload withSubscriptionID(String subscriptionid) {
        put("subscriptionid", subscriptionid);
        return this;
    }

    /***
     *
     * @param status The status to change the service to
     */
    public UpdateClientProductPayload withStatus(String status) {
        put("status", status);
        return this;
    }

    /***
     *
     * @param notes The admin notes for the service
     */
    public UpdateClientProductPayload withNotes(String notes) {
        put("notes", notes);
        return this;
    }

    /***
     *
     * @param serviceUsername The service username
     */
    public UpdateClientProductPayload withServiceUsername(String serviceUsername) {
        put("serviceusername", serviceUsername);
        return this;
    }

    /***
     *
     * @param servicePassword The service password
     */
    public UpdateClientProductPayload withServicePassword(String servicePassword) {
        put("servicepassword", servicePassword);
        return this;
    }

    /***
     *
     * @param overrideAutoSuspend Should override auto suspend be provided (‘on’ or ‘off’)
     */
    public UpdateClientProductPayload withOverrideAutoSuspend(String overrideAutoSuspend) {
        put("overideautosuspend", overrideAutoSuspend);
        return this;
    }

    /***
     *
     * @param overidesuspenduntil Update the Override Suspend date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withOveridesSuspendUntil(String overidesuspenduntil) {
        put("overidesuspenduntil", overidesuspenduntil);
        return this;
    }

    /***
     *
     * @param ns1 (VPS/Dedicated servers only)
     */
    public UpdateClientProductPayload withNS1(String ns1) {
        put("ns1", ns1);
        return this;
    }

    /***
     *
     * @param ns2 (VPS/Dedicated servers only)
     */
    public UpdateClientProductPayload withNS2(String ns2) {
        put("ns2", ns2);
        return this;
    }

    /***
     *
     * @param dedicatedip The dedicated IP.
     */
    public UpdateClientProductPayload withDedicatedIP(String dedicatedip) {
        put("dedicatedip", dedicatedip);
        return this;
    }

    /***
     *
     * @param assignedips (VPS/Dedicated servers only)
     */
    public UpdateClientProductPayload withAssighnedIP(String assignedips) {
        put("assignedips", assignedips);
        return this;
    }

    /***
     *
     * @param diskUsage The disk usage in bytes
     */
    public UpdateClientProductPayload withDiskUsage(int diskUsage) {
        put("diskusage", diskUsage);
        return this;
    }

    /***
     *
     * @param diskLimit The disk limit in bytes
     */
    public UpdateClientProductPayload withDiskLimit(int diskLimit) {
        put("disklimit", diskLimit);
        return this;
    }

    /***
     *
     * @param bwUsage The bandwidth usage in bytes
     */
    public UpdateClientProductPayload withBWUsage(int bwUsage) {
        put("bwusage", bwUsage);
        return this;
    }

    /***
     *
     * @param bwLimit The bandwidth limit in bytes
     */
    public UpdateClientProductPayload withBWLimit(int bwLimit) {
        put("bwlimit", bwLimit);
        return this;
    }

    /***
     *
     * @param suspendReason The suspend Reason
     */
    public UpdateClientProductPayload withSuspendReason(String suspendReason) {
        put("suspendreason", suspendReason);
        return this;
    }

    /***
     *
     * @param promoID The promotion Id to associate
     */
    public UpdateClientProductPayload withPromoID(int promoID) {
        put("promoid", promoID);
        return this;
    }

    /***
     *
     * @param unset An array of items to unset. Can be one of: ‘domain’, ‘serviceusername’, ‘servicepassword’, ‘subscriptionid’, ‘ns1’, ‘ns2’, ‘dedicatedip’, ‘assignedips’, ‘notes’, ‘suspendreason’
     */
    public UpdateClientProductPayload withUnset(JSONObject unset) {
        put("unset", unset);
        return this;
    }

    /***
     *
     * @param autoRecalc Should the recurring amount of the service be automatically recalculated (this will ignore any passed $recurringamount)
     */
    public UpdateClientProductPayload withAutoRecalc(boolean autoRecalc) {
        put("autorecalc", autoRecalc);
        return this;
    }

    /***
     *
     * @param customfields Base64 encoded serialized array of custom field values - base64_encode(serialize(array(“1”=>“Yahoo”)));
     */
    public UpdateClientProductPayload withCustomFields(String customfields) {
        put("customfields", customfields);
        return this;
    }

    /***
     *
     * @param configoptions Base64 encoded serialized array of configurable option field values - base64_encode(serialize(array(configoptionid => dropdownoptionid, XXX => array(‘optionid’ => YYY, ‘qty’ => ZZZ)))) - XXX is the ID of the configurable option - YYY is the optionid found in tblhostingconfigoption.optionid - ZZZ is the quantity you want to use for that option
     */
    public UpdateClientProductPayload withConfigOptions(String configoptions) {
        put("configoptions", configoptions);
        return this;
    }
}
