package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updatemoduleconfiguration/
 */
public class UpdateModuleConfigurationPayload extends Payload {

    /***
     *
     * @param moduleType The module type to be activated
     * @param moduleName The module name to be activated
     */
    public UpdateModuleConfigurationPayload(String moduleType, String moduleName) {
        super("UpdateModuleConfiguration");
        put("moduleType", moduleType);
        put("moduleName", moduleName);
    }

    /***
     *
     * @param parameters An array of configuration parameters to set for the given module. Use GetModuleConfigurationParameters to obtain a list of fields for a given module.
     */
    public UpdateModuleConfigurationPayload withParameters(JSONObject parameters) {
        put("parameters", parameters);
        return this;
    }
}
