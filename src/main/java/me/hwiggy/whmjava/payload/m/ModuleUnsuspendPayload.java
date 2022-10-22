package me.hwiggy.whmjava.payload.m;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/moduleunsuspend/
 */
public class ModuleUnsuspendPayload extends Payload {

    /***
     *
     * @param accountID The service ID to run the action for
     */
    public ModuleUnsuspendPayload(int accountID) {
        super("ModuleUnsuspend");
        put("accountid", accountID);
    }
}
