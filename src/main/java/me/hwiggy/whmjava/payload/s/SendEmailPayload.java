package me.hwiggy.whmjava.payload.s;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/starttasktimer/
 */
public class SendEmailPayload extends Payload {

    public SendEmailPayload() {
        super("SendEmail");
    }

    /***
     * @param messageName    The name of the client email template to send	Optional
     */
    public SendEmailPayload withMessageName(String messageName) {
        append("messagename", messageName);
        return this;
    }

    /***
     * @param id    The related id for the type of email template. Eg this should be the client id for a general type email	Optional
     */
    public SendEmailPayload withID(int id) {
        append("id", id);
        return this;
    }

    /***
     * @param customType    The type of custom email template to send (‘general’, ‘product’, ‘domain’, ‘invoice’, ‘support’, ‘affiliate’)	Optional
     */
    public SendEmailPayload withCustomType(String customType) {
        append("customtype", customType);
        return this;
    }

    /***
     * @param customMessage    The HTML message body to send for a custom email	Optional
     */
    public SendEmailPayload withCustomMessage(String customMessage) {
        append("custommessage", customMessage);
        return this;
    }

    /***
     * @param customSubject    The subject to send for a custom email	Optional
     */
    public SendEmailPayload withCustomSubject(String customSubject) {
        append("customsubject", customSubject);
        return this;
    }

    /***
     * @param customVars    The custom variables to provide to the email template. Can be used for existing and custom emails.	Optional
     */
    public SendEmailPayload withCustomVars(JSONObject customVars) {
        append("customvars", customVars);
        return this;
    }
}
