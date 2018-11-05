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
        append("serviceid", serviceID);
    }


    /***
     *
     * @param PID  The package id to associate with the service
     */
    public UpdateClientProductPayload withPID(int PID) {
        append("pid", PID);
        return this;
    }

    /***
     *
     * @param serverID  The server id to associate with the service
     */
    public UpdateClientProductPayload withServerID(int serverID) {
        append("serverid", serverID);
        return this;
    }

    /***
     *
     * @param nextDueDate  The next due date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withNextDueDate(String nextDueDate) {
        append("nextduedate", nextDueDate);
        return this;
    }

    /***
     *
     * @param terminationDate  Update the termination date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withTerminationDate(String terminationDate) {
        append("terminationDate", terminationDate);
        return this;
    }

    /***
     *
     * @param completedDate  Update the completed date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withCompletedDate(String completedDate) {
        append("completedDate", completedDate);
        return this;
    }

    /***
     *
     * @param domain The domain name to be changed to
     */
    public UpdateClientProductPayload withDomain(String domain) {
        append("domain", domain);
        return this;
    }

    /***
     *
     * @param firstPaymentAmount The first payment amount on the service
     */
    public UpdateClientProductPayload withFirstPaymentAmount(float firstPaymentAmount) {
        append("firstpaymentamount", firstPaymentAmount);
        return this;
    }

    /***
     *
     * @param reccuringAmount The recurring amount for automatic renewal invoices
     */
    public UpdateClientProductPayload withReccuringAmount(float reccuringAmount) {
        append("recurringamount",reccuringAmount);
        return this;
    }

    /***
     *
     * @param paymentMethod The payment method to associate in system format (eg paypal)
     */
    public UpdateClientProductPayload withPaymentMethod(String paymentMethod) {
        append("paymentmethod", paymentMethod);
        return this;
    }

    /***
     *
     * @param subscriptionid The subscription ID to associate with the service
     */
    public UpdateClientProductPayload withSubscriptionID(String subscriptionid) {
        append("subscriptionid", subscriptionid);
        return this;
    }

    /***
     *
     * @param status The status to change the service to
     */
    public UpdateClientProductPayload withStatus(String status) {
        append("status", status);
        return this;
    }

    /***
     *
     * @param notes The admin notes for the service
     */
    public UpdateClientProductPayload withNotes(String notes) {
        append("notes", notes);
        return this;
    }

    /***
     *
     * @param serviceUsername The service username
     */
    public UpdateClientProductPayload withServiceUsername(String serviceUsername) {
        append("serviceusername", serviceUsername);
        return this;
    }

    /***
     *
     * @param servicePassword The service password
     */
    public UpdateClientProductPayload withServicePassword(String servicePassword) {
        append("servicepassword", servicePassword);
        return this;
    }

    /***
     *
     * @param overrideAutoSuspend Should override auto suspend be provided (‘on’ or ‘off’)
     */
    public UpdateClientProductPayload withOverrideAutoSuspend(String overrideAutoSuspend) {
        append("overideautosuspend", overrideAutoSuspend);
        return this;
    }

    /***
     *
     * @param overidesuspenduntil Update the Override Suspend date of the service (Y-m-d)
     */
    public UpdateClientProductPayload withOveridesSuspendUntil(String overidesuspenduntil) {
        append("overidesuspenduntil", overidesuspenduntil);
        return this;
    }

    /***
     *
     * @param ns1 (VPS/Dedicated servers only)
     */
    public UpdateClientProductPayload withNS1(String ns1) {
        append("ns1", ns1);
        return this;
    }

    /***
     *
     * @param ns2 (VPS/Dedicated servers only)
     */
    public UpdateClientProductPayload withNS2(String ns2) {
        append("ns2", ns2);
        return this;
    }

    /***
     *
     * @param dedicatedip The dedicated IP.
     */
    public UpdateClientProductPayload withDedicatedIP(String dedicatedip) {
        append("dedicatedip", dedicatedip);
        return this;
    }

    /***
     *
     * @param assignedips (VPS/Dedicated servers only)
     */
    public UpdateClientProductPayload withAssighnedIP(String assignedips) {
        append("assignedips", assignedips);
        return this;
    }

    /***
     *
     * @param diskUsage The disk usage in bytes
     */
    public UpdateClientProductPayload withDiskUsage(int diskUsage) {
        append("diskusage", diskUsage);
        return this;
    }

    /***
     *
     * @param diskLimit The disk limit in bytes
     */
    public UpdateClientProductPayload withDiskLimit(int diskLimit) {
        append("disklimit", diskLimit);
        return this;
    }

    /***
     *
     * @param bwUsage The bandwidth usage in bytes
     */
    public UpdateClientProductPayload withBWUsage(int bwUsage) {
        append("bwusage", bwUsage);
        return this;
    }

    /***
     *
     * @param bwLimit The bandwidth limit in bytes
     */
    public UpdateClientProductPayload withBWLimit(int bwLimit) {
        append("bwlimit", bwLimit);
        return this;
    }

    /***
     *
     * @param suspendReason The suspend Reason
     */
    public UpdateClientProductPayload withSuspendReason(String suspendReason) {
        append("suspendreason", suspendReason);
        return this;
    }

    /***
     *
     * @param promoID The promotion Id to associate
     */
    public UpdateClientProductPayload withPromoID(int promoID) {
        append("promoid", promoID);
        return this;
    }

    /***
     *
     * @param unset An array of items to unset. Can be one of: ‘domain’, ‘serviceusername’, ‘servicepassword’, ‘subscriptionid’, ‘ns1’, ‘ns2’, ‘dedicatedip’, ‘assignedips’, ‘notes’, ‘suspendreason’
     */
    public UpdateClientProductPayload withUnset(JSONObject unset) {
        append("unset", unset);
        return this;
    }

    /***
     *
     * @param autoRecalc Should the recurring amount of the service be automatically recalculated (this will ignore any passed $recurringamount)
     */
    public UpdateClientProductPayload withAutoRecalc(boolean autoRecalc) {
        append("autorecalc", autoRecalc);
        return this;
    }

    /***
     *
     * @param customfields Base64 encoded serialized array of custom field values - base64_encode(serialize(array(“1”=>“Yahoo”)));
     */
    public UpdateClientProductPayload withCustomFields(String customfields) {
        append("customfields", customfields);
        return this;
    }

    /***
     *
     * @param configoptions Base64 encoded serialized array of configurable option field values - base64_encode(serialize(array(configoptionid => dropdownoptionid, XXX => array(‘optionid’ => YYY, ‘qty’ => ZZZ)))) - XXX is the ID of the configurable option - YYY is the optionid found in tblhostingconfigoption.optionid - ZZZ is the quantity you want to use for that option
     */
    public UpdateClientProductPayload withConfigOptions(String configoptions) {
        append("configoptions", configoptions);
        return this;
    }
}
