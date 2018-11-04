package me.hwiggy.whmjava.payload.c;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/createquote/
 */
public class CreateQuotePayload extends Payload {

    /***
     *
     * @param subject The subject of the new quote
     * @param stage The current stage of the quote (‘Draft’,‘Delivered’,‘On Hold’,‘Accepted’,‘Lost’,‘Dead’)
     * @param validUntil The date the quote is valid until in localised format (eg DD/MM/YYYY)
     */
    public CreateQuotePayload(String subject, String stage, String validUntil) {
        super("CreateQuote");
        append("subject", subject);
        append("stage", stage);
        append("validuntil", validUntil);
    }

    /***
     *
     * @param dateCreated The date the quote was created in localised format (eg DD/MM/YYYY)
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withDateCreated(String dateCreated){
        append("datecreated", dateCreated);
        return this;
    }

    /***
     *
     * @param lineItems A base64 encoded serialized array containing the following keys:
     *                  lineitems[x][desc] String The description of the line item
     *                  lineitems[x][qty] int The quantity of the line item being quoted for
     *                  lineitems[x][up] float The Unit Price of the line item
     *                  lineitems[x][discount] float The amount of discount to provide on the line items
     *                  lineitems[x][taxable] boolean Is the line item taxable
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withLineItems(JSONObject lineItems){
        append("lineitems", lineItems);
        return this;
    }

    /***
     *
     * @param userID If the quote is for an exising client, the client ID the quote is for
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withUserID(int userID){
        append("userid", userID);
        return this;
    }

    /***
     *
     * @param firstName The first name of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withFirstName(String firstName){
        append("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withLastName(String lastName){
        append("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withCompanyName(String companyName){
        append("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email The email address of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withEmail(String email){
        append("email", email);
        return this;
    }

    /***
     *
     * @param addressOne The address1 of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withAddressOne(String addressOne){
        append("address1", addressOne);
        return this;
    }

    /***
     *
     * @param addressTwo The address2 of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withAddressTwo(String addressTwo){
        append("address2", addressTwo);
        return this;
    }

    /***
     *
     * @param city The city of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withCity(String city){
        append("city", city);
        return this;
    }

    /***
     *
     * @param state The state of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withState(String state){
        append("state", state);
        return this;
    }

    /***
     *
     * @param country The country of the client the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withCountry(String country){
        append("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of the client (no country code) the quote is for if no $userid. Local format eg 4035551234
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withPhoneNumber(String phoneNumber){
        append("phonenumber", phoneNumber);
        return this;
    }

    /***
     *
     * @param currency The id of the currency for the quote is for if no $userid
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withCurrency(int currency){
        append("currency", currency);
        return this;
    }

    /***
     *
     * @param proposal The proposal text displayed to the end user
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withProposal(String proposal){
        append("proposal", proposal);
        return this;
    }

    /***
     *
     * @param customerNotes The notes on the quote displayed to the end user
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withCustomerNotes(String customerNotes){
        append("customernotes", customerNotes);
        return this;
    }

    /***
     *
     * @param adminNotes The notes on the quote displayed to the staff only
     * @return This Payload, for chaining
     */
    public CreateQuotePayload withAdminNotes(String adminNotes){
        append("adminnotes", adminNotes);
        return this;
    }
}
