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
        append("clientid", clientID);
    }

    /***
     *
     * @param firstName The first name of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withFirstName(String firstName){
        append("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withLastName(String lastName){
        append("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company name for this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withCompanyName(String companyName){
        append("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email Email address to identify the contact. This should be unique if the contact will be a sub-account
     * @return This Payload, for chaining
     */
    public AddContactPayload withEmail(String email){
        append("email", email);
        return this;
    }

    /***
     *
     * @param addressOne The first address of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withAddressOne(String addressOne){
        append("address1", addressOne);
        return this;
    }

    /***
     *
     * @param addressTwo The second address of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withAddressTwo(String addressTwo){
        append("address2", addressTwo);
        return this;
    }

    /***
     *
     * @param city The city of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withCity(String city){
        append("city", city);
        return this;
    }

    /***
     *
     * @param state The state of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withState(String state){
        append("state", state);
        return this;
    }

    /***
     *
     * @param postCode The postal code of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withPostCode(String postCode){
        append("postcode", postCode);
        return this;
    }

    /***
     *
     * @param country The 2 character ISO country code of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withCountry(String country){
        append("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of this contact
     * @return This Payload, for chaining
     */
    public AddContactPayload withPhoneNumber(String phoneNumber){
        append("phonenumber", phoneNumber);
        return this;
    }

    /***
     *
     * @param password The password of this contact, if creating a sub-account
     * @return This Payload, for chaining
     */
    public AddContactPayload withPassword(String password){
        append("password2", password);
        return this;
    }

    /***
     *
     * @param generalEmails Set true to receive general email types
     * @return This Payload, for chaining
     */
    public AddContactPayload withGeneralEmails(boolean generalEmails){
        append("generalemails", generalEmails);
        return this;
    }

    /***
     *
     * @param productEmails Set true to receive product related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withProductEmails(boolean productEmails){
        append("productemials", productEmails);
        return this;
    }

    /***
     *
     * @param domainEmails Set true to receive domain related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withDomainEmails(boolean domainEmails){
        append("domainemails", domainEmails);
        return this;
    }

    /***
     *
     * @param invoiceEmails Set true to receive billing related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withInvoiceEmails(boolean invoiceEmails){
        append("invoiceemails", invoiceEmails);
        return this;
    }

    /***
     *
     * @param supportEmails Set true to receive support ticket related emails
     * @return This Payload, for chaining
     */
    public AddContactPayload withSupportEmails(boolean supportEmails){
        append("supportemails", supportEmails);
        return this;
    }

    /***
     *
     * @param permissions A comma separated list of sub-account permissions. eg manageproducts,managedomains
     * @return This Payload, for chaining
     */
    public AddContactPayload withPermissions(String permissions){
        append("permissions", permissions);
        return this;
    }
}
