package me.hwiggy.whmjava.payload.m;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/modulechangepackage/
 */
public class ModuleChangePackagePayload extends Payload {

    /***
     *
     * @param accountID The service ID to run the action for
     */
    public ModuleChangePackagePayload(int accountID) {
        super("ModuleChangePackage");
        put("accountid",accountID);
    }
}
