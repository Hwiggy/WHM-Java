package me.hwiggy.whmjava.payload.s;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/starttasktimer/
 */
public class SetConfigurationValuePayload extends Payload {

    /***
     *
     * @param setting The setting name to change
     * @param value The value to set. Leave value blank to unset.
     */
    public SetConfigurationValuePayload(String setting, String value) {
        super("SetConfigurationValue");
        put("setting", setting);
        put("value", value);
    }
}
