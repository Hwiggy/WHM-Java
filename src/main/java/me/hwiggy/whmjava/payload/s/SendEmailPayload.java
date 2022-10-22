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
     * @param messageName    The name of the client email template to send	
     */
    public SendEmailPayload withMessageName(String messageName) {
        put("messagename", messageName);
        return this;
    }

    /***
     * @param id    The related id for the type of email template. Eg this should be the client id for a general type email	
     */
    public SendEmailPayload withID(int id) {
        put("id", id);
        return this;
    }

    /***
     * @param customType    The type of custom email template to send (‘general’, ‘product’, ‘domain’, ‘invoice’, ‘support’, ‘affiliate’)	
     */
    public SendEmailPayload withCustomType(String customType) {
        put("customtype", customType);
        return this;
    }

    /***
     * @param customMessage    The HTML message body to send for a custom email	
     */
    public SendEmailPayload withCustomMessage(String customMessage) {
        put("custommessage", customMessage);
        return this;
    }

    /***
     * @param customSubject    The subject to send for a custom email	
     */
    public SendEmailPayload withCustomSubject(String customSubject) {
        put("customsubject", customSubject);
        return this;
    }

    /***
     * @param customVars    The custom variables to provide to the email template. Can be used for existing and custom emails.	
     */
    public SendEmailPayload withCustomVars(JSONObject customVars) {
        put("customvars", customVars);
        return this;
    }
}
