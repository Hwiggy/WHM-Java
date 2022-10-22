package me.hwiggy.whmjava.payload.m;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/modulecustom/
 */
public class ModuleCustomPayload extends Payload {

    /***
     *
     * @param accountID The service ID to run the action for
     * @param func_name The name of the custom function to run
     */
    public ModuleCustomPayload(int accountID, String func_name) {
        super("ModuleCustom");
        put("accountid", accountID);
        put("func_name", func_name);
    }
}
