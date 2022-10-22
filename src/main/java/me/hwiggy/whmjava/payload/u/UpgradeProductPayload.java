package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/upgradeproduct/
 */
public class UpgradeProductPayload extends Payload {

    /***
     *
     * @param serviceID The ID of the service to update
     * @param paymentMethod The upgrade payment method in system format (e.g. paypal, Mailin)
     * @param type The type of upgrade (‘product’, ‘configoptions’)
     */
    public UpgradeProductPayload(int serviceID, String paymentMethod, String type) {
        super("UpgradeProduct");
        put("serviceid", serviceID);
        put("paymentmethod", paymentMethod);
        put("type", type);
    }

    /***
     *
     * @param calcOnly Only calculate the upgrade amount
     */
    public UpgradeProductPayload withCalcOnly(boolean calcOnly) {
        put("calconly", calcOnly);
        return this;
    }


    /***
     *
     * @param newProductID The Id of the new product
     */
    public UpgradeProductPayload withNewProductID(int newProductID) {
        put("newproductid", newProductID);
        return this;
    }

    /***
     *
     * @param newProductBillingCycle The new products billing cycle
     */
    public UpgradeProductPayload withNewProductBillingCycle(String newProductBillingCycle) {
        put("newproductbillingcycle", newProductBillingCycle);
        return this;
    }

    /***
     *
     * @param promoCode The promotion code to apply to the upgrade
     */
    public UpgradeProductPayload withPromoCode(String promoCode) {
        put("promocode", promoCode);
        return this;
    }

    /***
     *
     * @param configOptions An array of config options to upgrade:
     *                      configoptions[id] int The id of the config option
     *                      configoptions[optiontype] int The config option type
     *                      configoptions[selectedvalue] int The config option selected value
     *                      configoptions[selectedqty] int The config option quantity selected
     */
    public UpgradeProductPayload withConfigOptions(JSONObject configOptions) {
        put("configoptions", configOptions);
        return this;
    }
}
