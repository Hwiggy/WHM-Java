package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addcontact/
 */
public class AddContactPayload extends Payload {

    /***
     *
     * @param clientID The client ID to add this contact to
     */
    public AddContactPayload(int clientID) {
        super("AddContact");
        put("clientid", clientID);
    }

    /***
     *
     * @param firstName The first name of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withFirstName(String firstName){
        put("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withLastName(String lastName){
        put("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company name for this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withCompanyName(String companyName){
        put("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email Email address to identify the contact. This should be unique if the contact will be a sub-account
     * @return This Payload, for chaining
     */
    public AddContactPayload withEmail(String email){
        put("email", email);
        return this;
    }

    /***
     *
     * @param addressOne The first address of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withAddressOne(String addressOne){
        put("address1", addressOne);
        return this;
    }

    /***
     *
     * @param addressTwo The second address of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withAddressTwo(String addressTwo){
        put("address2", addressTwo);
        return this;
    }

    /***
     *
     * @param city The city of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withCity(String city){
        put("city", city);
        return this;
    }

    /***
     *
     * @param state The state of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withState(String state){
        put("state", state);
        return this;
    }

    /***
     *
     * @param postCode The postal code of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withPostCode(String postCode){
        put("postcode", postCode);
        return this;
    }

    /***
     *
     * @param country The 2 character ISO country code of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withCountry(String country){
        put("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withPhoneNumber(String phoneNumber){
        put("phonenumber", phoneNumber);
        return this;
    }

    /***
     *
     * @param password The password of this contact, if creating a sub-account
     * @return This Payload, for chaining
     */
    public AddContactPayload withPassword(String password){
        put("password2", password);
        return this;
    }

    /***
     *
     * @param generalEmails Set true to receive general email types
     * @return This Payload, for chaining
     */
    public AddContactPayload withGeneralEmails(boolean generalEmails){
        put("generalemails", generalEmails);
        return this;
    }

    /***
     *
     * @param productEmails Set true to receive product related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withProductEmails(boolean productEmails){
        put("productemials", productEmails);
        return this;
    }

    /***
     *
     * @param domainEmails Set true to receive domain related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withDomainEmails(boolean domainEmails){
        put("domainemails", domainEmails);
        return this;
    }

    /***
     *
     * @param invoiceEmails Set true to receive billing related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withInvoiceEmails(boolean invoiceEmails){
        put("invoiceemails", invoiceEmails);
        return this;
    }

    /***
     *
     * @param supportEmails Set true to receive support ticket related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withSupportEmails(boolean supportEmails){
        put("supportemails", supportEmails);
        return this;
    }

    /***
     *
     * @param permissions A comma separated list of sub-account permissions. eg manageproducts,managedomains
     * @return This Payload, for chaining
     */
    public AddContactPayload withPermissions(String permissions){
        put("permissions", permissions);
        return this;
    }
}
