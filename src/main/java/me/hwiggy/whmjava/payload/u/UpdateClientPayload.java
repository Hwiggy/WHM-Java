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
        put("clientid", clientID);
        return this;
    }

    /***
     *
     * @param clientEmail The email address of the client to update. Either $clientid or $clientemail is required
     */
    public UpdateClientPayload withClientEmail(String clientEmail) {
        put("clientemail", clientEmail);
        return this;
    }

    /***
     *
     * @param firstName The first name of the client the quote is for if no $userid
     */
    public UpdateClientPayload withFirstName(String firstName) {
        put("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of the client the quote is for if no $userid
     */
    public UpdateClientPayload withLastName(String lastName) {
        put("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company of the client the quote is for if no $userid
     */
    public UpdateClientPayload withCompanyName(String companyName) {
        put("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email The email address of the client the quote is for if no $userid
     */
    public UpdateClientPayload withEmail(String email) {
        put("email", email);
        return this;
    }

    /***
     *
     * @param address1 The address1 of the client the quote is for if no $userid
     */
    public UpdateClientPayload withAddress1(String address1) {
        put("address1", address1);
        return this;
    }

    /***
     *
     * @param address2 The address2 of the client the quote is for if no $userid
     */
    public UpdateClientPayload withAddress2(String address2) {
        put("address2", address2);
        return this;
    }

    /***
     *
     * @param city The city of the client the quote is for if no $userid
     */
    public UpdateClientPayload withCity(String city) {
        put("city", city);
        return this;
    }

    /***
     *
     * @param state The state of the client the quote is for if no $userid
     */
    public UpdateClientPayload withState(String state) {
        put("state", state);
        return this;
    }

    /***
     *
     * @param country The country of the client the quote is for if no $userid
     */
    public UpdateClientPayload withCountry(String country) {
        put("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of the client (no country code) the quote is for if no $userid. Local format eg 4035551234
     */
    public UpdateClientPayload withPhoneNumber(String phoneNumber) {
        put("phonenumber", phoneNumber);
        return this;
    }

    /***
     *
     * @param password2 (sub-account only)
     */
    public UpdateClientPayload withPassword2(String password2) {
        put("password2", password2);
        return this;
    }

    /***
     *
     * @param securityqid Security Question ID from tbladminsecurityquestions
     */
    public UpdateClientPayload withSecurityQID(int securityqid) {
        put("securityqid", securityqid);
        return this;
    }

    /***
     *
     * @param securityqans Security Question Answer
     */
    public UpdateClientPayload withSecurityAns(String securityqans) {
        put("securityqans", securityqans);
        return this;
    }

    /***
     *
     * @param cardtype Credit card type. Provide full name: Visa, Mastercard, American Express, etc…
     */
    public UpdateClientPayload withCardType(String cardtype) {
        put("cardtype", cardtype);
        return this;
    }

    /***
     *
     * @param cardnum Credit card number
     */
    public UpdateClientPayload withCardNum(String cardnum) {
        put("cardnum", cardnum);
        return this;
    }

    /***
     *
     * @param expdate Format: MMYY
     */
    public UpdateClientPayload withExpDate(String expdate) {
        put("expdate", expdate);
        return this;
    }

    /***
     *
     * @param startdate Format: MMYY (if applicable)
     */
    public UpdateClientPayload withStartDate(String startdate) {
        put("startdate", startdate);
        return this;
    }

    /***
     *
     * @param issuenumber Credit card issue number (if applicable)
     */
    public UpdateClientPayload withIssueDate(String issuenumber) {
        put("issuenumber", issuenumber);
        return this;
    }

    /***
     *
     * @param bankcode Client Bank Account Code (if applicable)
     */
    public UpdateClientPayload withBankCode(String bankcode) {
        put("bankcode", bankcode);
        return this;
    }

    /***
     *
     * @param bankacct Client bank Account number (if applicable)
     */
    public UpdateClientPayload withBankAcct(String bankacct) {
        put("bankacct", bankacct);
        return this;
    }

    /***
     *
     * @param cvv Credit card CVV number (will not be stored)
     */
    public UpdateClientPayload withCCV(String cvv) {
        put("cvv", cvv);
        return this;
    }

    /***
     *
     * @param currency Currency ID from tblcurrencies
     */
    public UpdateClientPayload withCurrency(int currency) {
        put("currency", currency);
        return this;
    }

    /***
     *
     * @param groupid Client Group ID from tblclientgroups
     */
    public UpdateClientPayload withGroupID(int groupid) {
        put("groupid", groupid);
        return this;
    }

    /***
     *
     * @param customfields Base64 encoded serialized array of custom field values
     */
    public UpdateClientPayload withCustomFields(String customfields) {
        put("customfields", customfields);
        return this;
    }

    /***
     *
     * @param language Default language setting. Provide full name: ‘english’, ‘french’, etc…
     */
    public UpdateClientPayload withLanguage(String language) {
        put("language",language);
        return this;
    }

    /***
     *
     * @param clientip IP address of the user
     */
    public UpdateClientPayload withClientIP(String clientip) {
        put("clientip", clientip);
        return this;
    }

    /***
     *
     * @param notes Admin only notes
     */
    public UpdateClientPayload withNotes(String notes) {
        put("notes", notes);
        return this;
    }

    /***
     *
     * @param status Status, e.g. “Active”
     */
    public UpdateClientPayload withStatus(String status) {
        put("status", status);
        return this;
    }

    /***
     *
     * @param paymentmethod The default payment method
     */
    public UpdateClientPayload withPaymentMethod(String paymentmethod) {
        put("paymentmethod",paymentmethod);
        return this;
    }

    /***
     *
     * @param marketingoptin Set true to opt client in to marketing emails
     */
    public UpdateClientPayload withMarketingOptIn(String marketingoptin) {
        put("marketingoptin", marketingoptin);
        return this;
    }

    /***
     *
     * @param clearcreditcard Pass as true to clear the stored CC details	
     */
    public UpdateClientPayload withClearCreditCard(String clearcreditcard) {
        put("clearcreditcard", clearcreditcard);
        return this;
    }

    /***
     *
     * @param skipvalidation Pass as true to ignore required fields validation	
     */
    public UpdateClientPayload withSkipValidation(String skipvalidation) {
        put("skipvalidation", skipvalidation);
        return this;
    }
}
