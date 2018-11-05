package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

import java.util.Scanner;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateclient/
 */
public class UpdateClientPayload extends Payload {

    public UpdateClientPayload() {
        super("UpdateClient");
    }

    /***
     *
     * @param clientID The id of the client to update
     */
    public UpdateClientPayload withClientID(String clientID) {
        append("clientid", clientID);
        return this;
    }

    /***
     *
     * @param clientEmail The email address of the client to update. Either $clientid or $clientemail is required
     */
    public UpdateClientPayload withClientEmail(String clientEmail) {
        append("clientemail", clientEmail);
        return this;
    }

    /***
     *
     * @param firstName The first name of the client the quote is for if no $userid
     */
    public UpdateClientPayload withFirstName(String firstName) {
        append("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of the client the quote is for if no $userid
     */
    public UpdateClientPayload withLastName(String lastName) {
        append("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company of the client the quote is for if no $userid
     */
    public UpdateClientPayload withCompanyName(String companyName) {
        append("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email The email address of the client the quote is for if no $userid
     */
    public UpdateClientPayload withEmail(String email) {
        append("email", email);
        return this;
    }

    /***
     *
     * @param address1 The address1 of the client the quote is for if no $userid
     */
    public UpdateClientPayload withAddress1(String address1) {
        append("address1", address1);
        return this;
    }

    /***
     *
     * @param address2 The address2 of the client the quote is for if no $userid
     */
    public UpdateClientPayload withAddress2(String address2) {
        append("address2", address2);
        return this;
    }

    /***
     *
     * @param city The city of the client the quote is for if no $userid
     */
    public UpdateClientPayload withCity(String city) {
        append("city", city);
        return this;
    }

    /***
     *
     * @param state The state of the client the quote is for if no $userid
     */
    public UpdateClientPayload withState(String state) {
        append("state", state);
        return this;
    }

    /***
     *
     * @param country The country of the client the quote is for if no $userid
     */
    public UpdateClientPayload withCountry(String country) {
        append("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of the client (no country code) the quote is for if no $userid. Local format eg 4035551234
     */
    public UpdateClientPayload withPhoneNumber(String phoneNumber) {
        append("phonenumber", phoneNumber);
        return this;
    }

    /***
     *
     * @param password2 (sub-account only)
     */
    public UpdateClientPayload withPassword2(String password2) {
        append("password2", password2);
        return this;
    }

    /***
     *
     * @param securityqid Security Question ID from tbladminsecurityquestions
     */
    public UpdateClientPayload withSecurityQID(int securityqid) {
        append("securityqid", securityqid);
        return this;
    }

    /***
     *
     * @param securityqans Security Question Answer
     */
    public UpdateClientPayload withSecurityAns(String securityqans) {
        append("securityqans", securityqans);
        return this;
    }

    /***
     *
     * @param cardtype Credit card type. Provide full name: Visa, Mastercard, American Express, etc…
     */
    public UpdateClientPayload withCardType(String cardtype) {
        append("cardtype", cardtype);
        return this;
    }

    /***
     *
     * @param cardnum Credit card number
     */
    public UpdateClientPayload withCardNum(String cardnum) {
        append("cardnum", cardnum);
        return this;
    }

    /***
     *
     * @param expdate Format: MMYY
     */
    public UpdateClientPayload withExpDate(String expdate) {
        append("expdate", expdate);
        return this;
    }

    /***
     *
     * @param startdate Format: MMYY (if applicable)
     */
    public UpdateClientPayload withStartDate(String startdate) {
        append("startdate", startdate);
        return this;
    }

    /***
     *
     * @param issuenumber Credit card issue number (if applicable)
     */
    public UpdateClientPayload withIssueDate(String issuenumber) {
        append("issuenumber", issuenumber);
        return this;
    }

    /***
     *
     * @param bankcode Client Bank Account Code (if applicable)
     */
    public UpdateClientPayload withBankCode(String bankcode) {
        append("bankcode", bankcode);
        return this;
    }

    /***
     *
     * @param bankacct Client bank Account number (if applicable)
     */
    public UpdateClientPayload withBankAcct(String bankacct) {
        append("bankacct", bankacct);
        return this;
    }

    /***
     *
     * @param cvv Credit card CVV number (will not be stored)
     */
    public UpdateClientPayload withCCV(String cvv) {
        append("cvv", cvv);
        return this;
    }

    /***
     *
     * @param currency Currency ID from tblcurrencies
     */
    public UpdateClientPayload withCurrency(int currency) {
        append("currency", currency);
        return this;
    }

    /***
     *
     * @param groupid Client Group ID from tblclientgroups
     */
    public UpdateClientPayload withGroupID(int groupid) {
        append("groupid", groupid);
        return this;
    }

    /***
     *
     * @param customfields Base64 encoded serialized array of custom field values
     */
    public UpdateClientPayload withCustomFields(String customfields) {
        append("customfields", customfields);
        return this;
    }

    /***
     *
     * @param language Default language setting. Provide full name: ‘english’, ‘french’, etc…
     */
    public UpdateClientPayload withLanguage(String language) {
        append("language",language);
        return this;
    }

    /***
     *
     * @param clientip IP address of the user
     */
    public UpdateClientPayload withClientIP(String clientip) {
        append("clientip", clientip);
        return this;
    }

    /***
     *
     * @param notes Admin only notes
     */
    public UpdateClientPayload withNotes(String notes) {
        append("notes", notes);
        return this;
    }

    /***
     *
     * @param status Status, e.g. “Active”
     */
    public UpdateClientPayload withStatus(String status) {
        append("status", status);
        return this;
    }

    /***
     *
     * @param paymentmethod The default payment method
     */
    public UpdateClientPayload withPaymentMethod(String paymentmethod) {
        append("paymentmethod",paymentmethod);
        return this;
    }

    /***
     *
     * @param marketingoptin Set true to opt client in to marketing emails
     */
    public UpdateClientPayload withMarketingOptIn(String marketingoptin) {
        append("marketingoptin", marketingoptin);
        return this;
    }

    /***
     *
     * @param clearcreditcard Pass as true to clear the stored CC details	
     */
    public UpdateClientPayload withClearCreditCard(String clearcreditcard) {
        append("clearcreditcard", clearcreditcard);
        return this;
    }

    /***
     *
     * @param skipvalidation Pass as true to ignore required fields validation	
     */
    public UpdateClientPayload withSkipValidation(String skipvalidation) {
        append("skipvalidation", skipvalidation);
        return this;
    }
}
