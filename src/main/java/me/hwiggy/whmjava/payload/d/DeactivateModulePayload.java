package me.hwiggy.whmjava.payload.d;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/deactivatemodule/
 */
public class DeactivateModulePayload extends Payload {

    /***
     *
     * @param moduleType The module type to be deactivated
     * @param moduleName The module name to be deactivated
     */
    public DeactivateModulePayload(String moduleType, String moduleName) {
        super("DeactivateModule");
        put("moduletype", moduleType);
        put("modulename", moduleName);
    }
}
