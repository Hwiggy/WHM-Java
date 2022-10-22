package me.hwiggy.whmjava.payload.m;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/modulechangepw/
 */
public class ModuleChangePwPayload extends Payload {

    public ModuleChangePwPayload(int accountID) {
        super("ModuleChangePw");
        put("accountid", accountID);
    }

    public ModuleChangePwPayload withServicePassword(String servicePassword) {
        put("servicepassword", servicePassword);
        return this;
    }
}
