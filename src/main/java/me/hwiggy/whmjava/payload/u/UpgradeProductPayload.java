package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addticketreply/
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
        append("serviceid", serviceID);
        append("paymentmethod", paymentMethod);
        append("type", type);
    }

    /***
     *
     * @param calconly Only calculate the upgrade amount
     */
    public UpgradeProductPayload withCalconly(boolean calconly) {
        append("calconly", calconly);
        return this;
    }


    /***
     *
     * @param newProductID The Id of the new product
     */
    public UpgradeProductPayload withNewProductID(int newProductID) {
        append("newproductid", newProductID);
        return this;
    }

    /***
     *
     * @param newproductbillingcycle The new products billing cycle
     */
    public UpgradeProductPayload withNewProductBillingCycle(String newproductbillingcycle) {
        append("newproductbillingcycle", newproductbillingcycle);
        return this;
    }

    /***
     *
     * @param promocode The promotion code to apply to the upgrade
     */
    public UpgradeProductPayload withPromoCode(String promocode) {
        append("promocode", promocode);
        return this;
    }

    /***
     *
     * @param configOptions An array of config options to upgrade
     */
    public UpgradeProductPayload withConfigOptions(JSONObject configOptions) {
        append("configoptions", configOptions);
        return this;
    }

    /***
     *
     * @param configOptions_id_ The id of the config option
     */
    public UpgradeProductPayload withConfigOptions_id_(int configOptions_id_) {
        append("configoptions[id]", configOptions_id_);
        return this;
    }

    /***
     *
     * @param configOptions_optiontype_ The config option type
     */
    public UpgradeProductPayload withConfigOptions_optiontype_(int configOptions_optiontype_) {
        append("configoptions[optiontype]", configOptions_optiontype_);
        return this;
    }

    /***
     *
     * @param configOptions_selectedvalue_ The config option selected value
     */
    public UpgradeProductPayload withConfigOptions_selectedvalue_(int configOptions_selectedvalue_) {
        append("configoptions[selectedvalue]", configOptions_selectedvalue_);
        return this;
    }

    /***
     *
     * @param configOptions_selectedqty_ The config option quantity selected
     */
    public UpgradeProductPayload withConfigOptions_selectedqty_	(int configOptions_selectedqty_) {
        append("configoptions[selectedqty]", configOptions_selectedqty_);
        return this;
    }
}
