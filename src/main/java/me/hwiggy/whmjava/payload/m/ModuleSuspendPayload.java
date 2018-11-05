package me.hwiggy.whmjava.payload.m;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/modulesuspend/
 */
public class ModuleSuspendPayload extends Payload {

    /***
     *
     * @param accountID The service ID to run the action for
     */
    public ModuleSuspendPayload(int accountID) {
        super("ModuleSuspend");
        append("accountid", accountID);
    }

    /***
     *
     * @param suspendReason A reason for the suspension
     */
    public ModuleSuspendPayload withSuspendReason(String suspendReason) {
        append("suspendreason", suspendReason);
        return this;
    }
}
