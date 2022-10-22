package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateticket/
 */
public class UpdateTicketPayload extends Payload {

    /***
     *
     * @param ticketID The ticket Id to update
     */
    public UpdateTicketPayload(int ticketID) {
        super("UpdateTicket");
        put("ticketid", ticketID);
    }

    /***
     *
     * @param deptID The department id of the ticket
     */
    public UpdateTicketPayload withDeptID(int deptID) {
        put("deptid", deptID);
        return this;
    }

    /***
     *
     * @param status The status of the ticket
     */
    public UpdateTicketPayload withStatus(String status) {
        put("status", status);
        return this;
    }

    /***
     *
     * @param subject The subject of the ticket
     */
    public UpdateTicketPayload withSubject(String subject) {
        put("subject", subject);
        return this;
    }

    /***
     *
     * @param userid If applicable, the Client ID to update the ticket for.
     */
    public UpdateTicketPayload withUserID(int userid) {
        put("userid", userid);
        return this;
    }

    /***
     *
     * @param name The name of the person opening the ticket (if not a client)
     */
    public UpdateTicketPayload withName(String name) {
        put("name", name);
        return this;
    }

    /***
     *
     * @param email The email address of the person opening the ticket (if not a client)
     */
    public UpdateTicketPayload withEmail(String email) {
        put("email", email);
        return this;
    }

    /***
     *
     * @param cc The cc email addresses for the ticket
     */
    public UpdateTicketPayload withCC(String cc) {
        put("cc", cc);
        return this;
    }

    /***
     *
     * @param priority The priority of the ticket (‘Low’, ‘Medium’, ‘High’)
     */
    public UpdateTicketPayload withPriority(String priority) {
        put("priority", priority);
        return this;
    }

    /***
     *
     * @param flag The id of the admin to flag the ticket to
     */
    public UpdateTicketPayload withFlag(int flag) {
        put("flag", flag);
        return this;
    }

    /***
     *
     * @param removeFlag Remove the flag from the ticket
     */
    public UpdateTicketPayload withRemoveFlag(boolean removeFlag) {
        put("removeFlag", removeFlag);
        return this;
    }

    /***
     *
     * @param useMarkdown Should markdown be used on the ticket output
     */
    public UpdateTicketPayload withUseMarkdown(boolean useMarkdown) {
        put("useMarkdown", useMarkdown);
        return this;
    }

    /***
     *
     * @param customfields Base64 encoded serialized array of custom field values
     */
    public UpdateTicketPayload withCustomfields(String customfields) {
        put("customfields", customfields);
        return this;
    }
}
