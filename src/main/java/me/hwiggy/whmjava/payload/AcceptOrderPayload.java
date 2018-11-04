package me.hwiggy.whmjava.payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/acceptorder/
 */
public class AcceptOrderPayload extends Payload {

    /***
     *
     * @param orderID The order id to be accepted
     */
    public AcceptOrderPayload(int orderID) {
        super("AcceptOrder");
        append("orderid", orderID);
    }

    /***
     *
     * @param serverID The specific server to assign to products within the order
     * @return This Payload, for chaining
     */
    public AcceptOrderPayload withServerID(int serverID){
        append("serverid", serverID);
        return this;
    }

    /***
     *
     * @param serviceUsername The specific username to assign to products within the order
     * @return This Payload, for chaining
     */
    public AcceptOrderPayload withServiceUsername(String serviceUsername){
        append("serviceusername", serviceUsername);
        return this;
    }

    /***
     *
     * @param servicePassword The specific password to assign to products within the order
     * @return This Payload, for chaining
     */
    public AcceptOrderPayload withServicePassword(String servicePassword){
        append("servicepassword", servicePassword);
        return this;
    }

    /***
     *
     * @param registrar The specific registrar to assign to domains within the order
     * @return This Payload, for chaining
     */
    public AcceptOrderPayload withRegistrar(String registrar){
        append("registrar", registrar);
        return this;
    }

    /***
     *
     * @param sendRegistrar Send the request to the registrar to register the domain.
     * @return This Payload, for chaining
     */
    public AcceptOrderPayload toSendRegistrar(boolean sendRegistrar){
        append("sendregistrar", sendRegistrar);
        return this;
    }

    /***
     *
     * @param autoSetup Send the request to the product module to activate the service. This can override the product configuration.
     * @return This Payload, for chaining
     */
    public AcceptOrderPayload toAutoSetup(boolean autoSetup){
        append("autosetup", autoSetup);
        return this;
    }

    /***
     *
     * @param sendEmail Send any automatic emails. This can be Product Welcome, Domain Renewal, Domain Transfer etc.
     * @return This Payload, for chaining
     */
    public AcceptOrderPayload toSendEmail(boolean sendEmail){
        append("sendemail", sendEmail);
        return this;
    }
}
