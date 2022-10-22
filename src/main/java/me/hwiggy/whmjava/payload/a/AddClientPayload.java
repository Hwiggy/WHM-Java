package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addclient/
 */
public class AddClientPayload extends Payload {

    /***
     * 
     * @param firstName The first name of this client
     * @param lastName The last name of this client
     * @param email The email address of this client
     * @param address The address of this client
     * @param city The city of this client
     * @param state The state of this client
     * @param postCode The postal code of this client
     * @param country The 2 character ISO country code of this client
     * @param phoneNumber The phone number of this client
     * @param password The password of this client
     */
    protected AddClientPayload(
            String firstName,
            String lastName,
            String email,
            String address,
            String city,
            String state,
            String postCode,
            String country,
            String phoneNumber,
            String password
    ) {
        super("AddClient");
        put("firstname", firstName);
        put("lastname", lastName);
        put("email", email);
        put("address1", address);
        put("city", city);
        put("state", state);
        put("postcode", postCode);
        put("country", country);
        put("phonenumber", phoneNumber);
        put("password2", password);
    }

    /***
     * 
     * @param companyName The company name of this client
     * @return This Payload, for chaining
     */
    public AddClientPayload withCompanyName(String companyName){
        put("companyname", companyName);
        return this;
    }

    /***
     * 
     * @param addressTwo The second address of this client
     * @return This Payload, for chaining
     */
    public AddClientPayload withAddressTwo(String addressTwo){
        put("address2", addressTwo);
        return this;
    }

    /***
     *
     * @param securityQID Security Question ID from tbladminsecurityquestions
     * @return This Payload, for chaining
     */
    public AddClientPayload withSecurityQID(int securityQID){
        put("securityqid", securityQID);
        return this;
    }

    /***
     *
     * @param securityQAns Security Question Answer
     * @return This Payload, for chaining
     */
    public AddClientPayload withSecurityQAns(String securityQAns){
        put("securityqans", securityQAns);
        return this;
    }

    /***
     *
     * @param cardType Credit card type. Provide full name: Visa, Mastercard, American Express, etc…
     * @return This Payload, for chaining
     */
    public AddClientPayload withCardType(String cardType){
        put("cardtype", cardType);
        return this;
    }

    /***
     *
     * @param cardNum Credit card number
     * @return This Payload, for chaining
     */
    public AddClientPayload withCardNum(String cardNum){
        put("cardnum", cardNum);
        return this;
    }

    /***
     *
     * @param expDate Format: MMYY
     * @return This Payload, for chaining
     */
    public AddClientPayload withExpDate(String expDate){
        put("expdate", expDate);
        return this;
    }

    /***
     *
     * @param startDate Format: MMYY (if applicable)
     * @return This Payload, for chaining
     */
    public AddClientPayload withStartDate(String startDate){
        put("startdate", startDate);
        return this;
    }

    /***
     *
     * @param issueNumber Credit card issue number (if applicable)
     * @return This Payload, for chaining
     */
    public AddClientPayload withIssueNumber(String issueNumber){
        put("issuenumber", issueNumber);
        return this;
    }

    /***
     *
     * @param CVV Credit card CVV number (will not be stored)
     * @return This Payload, for chaining
     */
    public AddClientPayload withCVV(String CVV){
        put("cvv", CVV);
        return this;
    }

    /***
     *
     * @param currency Currency ID from tblcurrencies
     * @return This Payload, for chaining
     */
    public AddClientPayload withCurrency(int currency){
        put("currency", currency);
        return this;
    }

    /***
     *
     * @param groupID Client Group ID from tblclientgroups
     * @return This Payload, for chaining
     */
    public AddClientPayload withGroupID(int groupID){
        put("groupid", groupID);
        return this;
    }

    /***
     *
     * @param customFields Base64 encoded serialized array of custom field values
     * @return This Payload, for chaining
     */
    public AddClientPayload withCustomFields(String customFields){
        put("customfields", customFields);
        return this;
    }

    /***
     *
     * @param language Default language setting. Provide full name: ‘english’, ‘french’, etc…
     * @return This Payload, for chaining
     */
    public AddClientPayload withLanguage(String language){
        put("language", language);
        return this;
    }

    /***
     *
     * @param clientIP IP address of the user
     * @return This Payload, for chaining
     */
    public AddClientPayload withClientIP(String clientIP){
        put("clientip", clientIP);
        return this;
    }

    /***
     *
     * @param notes Admin only notes
     * @return This Payload, for chaining
     */
    public AddClientPayload withNotes(String notes){
        put("notes", notes);
        return this;
    }

    /***
     *
     * @param marketingOptIn Set true to opt client in to marketing emails
     * @return This Payload, for chaining
     */
    public AddClientPayload withMarketingOptIn(boolean marketingOptIn){
        put("marketingoptin", marketingOptIn);
        return this;
    }

    /***
     *
     * @param noEmail Pass as true to skip sending welcome email
     * @return This Payload, for chaining
     */
    public AddClientPayload withNoEmail(boolean noEmail){
        put("noemail", noEmail);
        return this;
    }

    /***
     *
     * @param skipValidation Pass as true to ignore required fields validation
     * @return This Payload, for chaining
     */
    public AddClientPayload withSkipValidation(boolean skipValidation){
        put("skipvalidation", skipValidation);
        return this;
    }
}

