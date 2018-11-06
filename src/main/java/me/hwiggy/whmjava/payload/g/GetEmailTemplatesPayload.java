package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

public class GetEmailTemplatesPayload extends Payload {
    public GetEmailTemplatesPayload() {
        super("GetEmailTemplates");
    }

    /***
     * @param type The type of email template to retrieve
     */
    public GetEmailTemplatesPayload withautype(String type) {
        append("type", type);
        return this;
    }

    /***
     * @param language The language of the email template to retrieve, if none provided will return default language templates.
     */
    public GetEmailTemplatesPayload withaulanguage(String language) {
        append("language", language);
        return this;
    }
}
