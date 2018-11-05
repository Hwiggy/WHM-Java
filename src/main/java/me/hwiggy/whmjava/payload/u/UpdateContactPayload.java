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
        append("subaccount", subaccount);
        return this;
    }

    /***
     *
     * @param firstName The first name of the client the quote is for if no $userid
     */
    public UpdateContactPayload withFirstName(String firstName) {
        append("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of the client the quote is for if no $userid
     */
    public UpdateContactPayload withLastName(String lastName) {
        append("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company of the client the quote is for if no $userid
     */
    public UpdateContactPayload withCompanyName(String companyName) {
        append("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email The email address of the client the quote is for if no $userid
     */
    public UpdateContactPayload withEmail(String email) {
        append("email", email);
        return this;
    }

    /***
     *
     * @param address1 The address1 of the client the quote is for if no $userid
     */
    public UpdateContactPayload withAddress1(String address1) {
        append("address1", address1);
        return this;
    }

    /***
     *
     * @param address2 The address2 of the client the quote is for if no $userid
     */
    public UpdateContactPayload withAddress2(String address2) {
        append("address2", address2);
        return this;
    }

    /***
     *
     * @param city The city of the client the quote is for if no $userid
     */
    public UpdateContactPayload withCity(String city) {
        append("city", city);
        return this;
    }

    /***
     *
     * @param state The state of the client the quote is for if no $userid
     */
    public UpdateContactPayload withState(String state) {
        append("state", state);
        return this;
    }

    /***
     *
     * @param country The country of the client the quote is for if no $userid
     */
    public UpdateContactPayload withCountry(String country) {
        append("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of the client (no country code) the quote is for if no $userid. Local format eg 4035551234
     */
    public UpdateContactPayload withPhoneNumber(String phoneNumber) {
        append("phonenumber", phoneNumber);
        return this;
    }

    /***
     * 
     * @param password2 (sub-account only)
     */
    public UpdateContactPayload withPassword2(String password2) {
        append("password2", password2);
        return this;
    }

    /***
     * 
     * @param generalEmails Should the contact receive general emails
     */
    public UpdateContactPayload withGeneralEmails(boolean generalEmails) {
        append("generalemails", generalEmails);
        return this;
    }

    /***
     * 
     * @param productEmails Should the contact receive product emails
     */
    public UpdateContactPayload withProductEmails(boolean productEmails) {
        append("productemails", productEmails);
        return this;
    }

    /***
     * 
     * @param domainemails Should the contact receive domain emails
     */
    public UpdateContactPayload withDomainEmails(boolean domainemails) {
        append("domainemails", domainemails);
        return this;
    }

    /***
     * 
     * @param invoiceemails Should the contact receive invoice emails
     */
    public UpdateContactPayload withInvoiceEmails(boolean invoiceemails) {
        append("invoiceemails", invoiceemails);
        return this;
    }

    /***
     * 
     * @param supportemails Should the contact receive support emails
     */
    public UpdateContactPayload withSupportEmails(boolean supportemails) {
        append("supportemails", supportemails);
        return this;
    }

    /***
     * 
     * @param permissions A comma separated list of sub-account permissions. eg manageproducts,managedomains
     */
    public UpdateContactPayload withPermissions(String permissions) {
        append("permissions",permissions);
        return this;
    }
}
