package me.hwiggy.whmjava.payload.o;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/openticket/
 */
public class OpenTicketPayload extends Payload {


    public OpenTicketPayload(int deptID, String subject, String message) {
        super("OpenTicket");
        append("deptid", deptID);
        append("subject", subject);
        append("message", message);
    }

    /***
     * @param clientID    If applicable, the Client ID to create the ticket for.	
     */
    public OpenTicketPayload withClientID(int clientID) {
        append("clientid", clientID);
        return this;
    }

    /***
     * @param contactID    If applicable, the Contact ID to create the ticket for (only if $clientID is passed).	
     */
    public OpenTicketPayload withContactID(int contactID) {
        append("contactid", contactID);
        return this;
    }

    /***
     * @param name    The name of the person opening the ticket (if not a client)	
     */
    public OpenTicketPayload withName(String name) {
        append("name", name);
        return this;
    }

    /***
     * @param email    The email address of the person opening the ticket (if not a client)	
     */
    public OpenTicketPayload withEmail(String email) {
        append("email", email);
        return this;
    }

    /***
     * @param priority    The priority of the ticket (‘Low’, ‘Medium’, ‘High’)	
     */
    public OpenTicketPayload withPriority(String priority) {
        append("priority", priority);
        return this;
    }

    /***
     * @param serviceID    The service to associate the ticket with (only one of $serviceID or $domainID)	
     */
    public OpenTicketPayload withServiceID(int serviceID) {
        append("serviceid", serviceID);
        return this;
    }

    /***
     * @param domainID    The domain to associate the ticket with (only one of $serviceID or $domainID)	
     */
    public OpenTicketPayload withDomainID(int domainID) {
        append("domainid", domainID);
        return this;
    }

    /***
     * @param admin    Is an Admin opening the ticket	
     */
    public OpenTicketPayload withAdmin(boolean admin) {
        append("admin", admin);
        return this;
    }

    /***
     * @param markdown    Should markdown be used on the ticket output	
     */
    public OpenTicketPayload withMarkdown(boolean markdown) {
        append("markdown", markdown);
        return this;
    }

    /***
     * @param customFields    Base64 encoded serialized array of custom field values	
     */
    public OpenTicketPayload withCustomFields(String customFields) {
        append("customfields", customFields);
        return this;
    }

    /***
     * @param attachments     base64 json encoded array of file attachments. Can be the direct output of a multipart-form-data form submission ($_FILES superglobal in PHP) or an array of arrays consisting of both a filename and data keys (see example below).	
     */
    public OpenTicketPayload withAttachments(JSONObject attachments) {
        append("attachments", attachments);
        return this;
    }
}
