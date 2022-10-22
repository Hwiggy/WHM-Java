package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addticketnote/
 */
public class AddTicketNotePayload extends Payload {

    /***
     *
     * @param message The content of the ticket note
     * @param ticketNum The Client Ticket Number ID to apply the note to
     */
    public AddTicketNotePayload(String message, String ticketNum) {
        super("AddTicketNote");
        put("message", message);
        put("ticketnum", ticketNum);
    }

    /***
     *
     * @param message The content of the ticket note
     * @param ticketID The id of the ticket in the database.
     */
    public AddTicketNotePayload(String message, int ticketID){
        super("AddTicketNote");
        put("message", message);
        put("ticketid", ticketID);
    }

    /***
     *
     * @param markdown Should markdown be used on the ticket note output
     * @return This Payload, for chaining
     */
    public AddTicketNotePayload withMarkdown(boolean markdown){
        put("markdown", markdown);
        return this;
    }

    /***
     *
     * @param attachments Optional base64 json encoded array of file attachments. Can be the direct output of a multipart-form-data form submission ($_FILES superglobal in PHP) or an array of arrays consisting of both a filename and data keys
     * @return This Payload, for chaining
     */
    public AddTicketNotePayload withAttachments(JSONObject attachments){
        put("attachments", attachments);
        return this;
    }
}
