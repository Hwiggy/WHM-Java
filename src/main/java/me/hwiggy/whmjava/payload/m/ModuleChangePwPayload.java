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
        append("accountid", accountID);
    }

    public ModuleChangePwPayload withServicePassword(String servicePassword) {
        append("servicepassword", servicePassword);
        return this;
    }
}
