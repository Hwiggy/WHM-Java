package me.hwiggy.whmjava.payload.s;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/sendadminemail/
 */
public class SendAdminEmailPayload extends Payload {
    public SendAdminEmailPayload() {
        super("SendAdminEmail");
    }

    /***
     * @param messagename    The name of the admin email template to send	Optional
     */
    public SendAdminEmailPayload withMessagename(String messagename) {
        append("messagename", messagename);
        return this;
    }

    /***
     * @param custommessage    The HTML message body to send for a custom email	Optional
     */
    public SendAdminEmailPayload withCustommessage(String custommessage) {
        append("custommessage", custommessage);
        return this;
    }

    /***
     * @param customsubject    The subject to send for a custom email	Optional
     */
    public SendAdminEmailPayload withCustomsubject(String customsubject) {
        append("customsubject", customsubject);
        return this;
    }

    /***
     * @param type    Which type of admin notification will be send (‘system’, ‘account’, ‘support’)	Optional
     */
    public SendAdminEmailPayload withType(String type) {
        append("type", type);
        return this;
    }

    /***
     * @param deptid    The Id of the department the notification is for if ‘support’ $type	Optional
     */
    public SendAdminEmailPayload withDeptid(int deptid) {
        append("deptid", deptid);
        return this;
    }

    /***
     * @param mergefields    The merge fields to be used in the email template	Optional
     */
    public SendAdminEmailPayload withMergefields(JSONObject mergefields) {
        append("mergefields", mergefields);
        return this;
    }
}
