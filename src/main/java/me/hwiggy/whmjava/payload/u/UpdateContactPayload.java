package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updatecontact/
 */
public class UpdateContactPayload extends Payload {

    public UpdateContactPayload(int contactID) {
        super("UpdateContact");
    }


    /***
     * 
     * @param subaccount Is the contact a subaccount
     */
    public UpdateContactPayload withSubAcount(boolean subaccount) {
        put("subaccount", subaccount);
        return this;
    }

    /***
     *
     * @param firstName The first name of the client the quote is for if no $userid
     */
    public UpdateContactPayload withFirstName(String firstName) {
        put("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of the client the quote is for if no $userid
     */
    public UpdateContactPayload withLastName(String lastName) {
        put("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company of the client the quote is for if no $userid
     */
    public UpdateContactPayload withCompanyName(String companyName) {
        put("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email The email address of the client the quote is for if no $userid
     */
    public UpdateContactPayload withEmail(String email) {
        put("email", email);
        return this;
    }

    /***
     *
     * @param address1 The address1 of the client the quote is for if no $userid
     */
    public UpdateContactPayload withAddress1(String address1) {
        put("address1", address1);
        return this;
    }

    /***
     *
     * @param address2 The address2 of the client the quote is for if no $userid
     */
    public UpdateContactPayload withAddress2(String address2) {
        put("address2", address2);
        return this;
    }

    /***
     *
     * @param city The city of the client the quote is for if no $userid
     */
    public UpdateContactPayload withCity(String city) {
        put("city", city);
        return this;
    }

    /***
     *
     * @param state The state of the client the quote is for if no $userid
     */
    public UpdateContactPayload withState(String state) {
        put("state", state);
        return this;
    }

    /***
     *
     * @param country The country of the client the quote is for if no $userid
     */
    public UpdateContactPayload withCountry(String country) {
        put("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of the client (no country code) the quote is for if no $userid. Local format eg 4035551234
     */
    public UpdateContactPayload withPhoneNumber(String phoneNumber) {
        put("phonenumber", phoneNumber);
        return this;
    }

    /***
     * 
     * @param password2 (sub-account only)
     */
    public UpdateContactPayload withPassword2(String password2) {
        put("password2", password2);
        return this;
    }

    /***
     * 
     * @param generalEmails Should the contact receive general emails
     */
    public UpdateContactPayload withGeneralEmails(boolean generalEmails) {
        put("generalemails", generalEmails);
        return this;
    }

    /***
     * 
     * @param productEmails Should the contact receive product emails
     */
    public UpdateContactPayload withProductEmails(boolean productEmails) {
        put("productemails", productEmails);
        return this;
    }

    /***
     * 
     * @param domainemails Should the contact receive domain emails
     */
    public UpdateContactPayload withDomainEmails(boolean domainemails) {
        put("domainemails", domainemails);
        return this;
    }

    /***
     * 
     * @param invoiceemails Should the contact receive invoice emails
     */
    public UpdateContactPayload withInvoiceEmails(boolean invoiceemails) {
        put("invoiceemails", invoiceemails);
        return this;
    }

    /***
     * 
     * @param supportemails Should the contact receive support emails
     */
    public UpdateContactPayload withSupportEmails(boolean supportemails) {
        put("supportemails", supportemails);
        return this;
    }

    /***
     * 
     * @param permissions A comma separated list of sub-account permissions. eg manageproducts,managedomains
     */
    public UpdateContactPayload withPermissions(String permissions) {
        put("permissions",permissions);
        return this;
    }
}
