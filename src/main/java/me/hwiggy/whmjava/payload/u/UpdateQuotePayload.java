package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updatequote/
 */
public class UpdateQuotePayload extends Payload {

    /***
     *
     * @param quoteID The ID of the quote to update
     */
    public UpdateQuotePayload(int quoteID) {
        super("UpdateQuote");
        append("quoteid", quoteID);
    }

    /***
     *
     * @param subject The subject of the quote
     */
    public UpdateQuotePayload withSubject(String subject) {
        append("subject", subject);
        return this;
    }

    /***
     *
     * @param stage The current stage of the quote (‘Draft’,‘Delivered’,‘On Hold’,‘Accepted’,‘Lost’,‘Dead’)
     */
    public UpdateQuotePayload withStage(String stage) {
        append("stage", stage);
        return this;
    }

    /***
     *
     * @param validUntil The date the quote is valid until in localised format (eg DD/MM/YYYY)
     */
    public UpdateQuotePayload withValidUntil(String validUntil) {
        append("validuntil", validUntil);
        return this;
    }

    /***
     *
     * @param dateCreated The date the quote was created in localised format (eg DD/MM/YYYY)
     */
    public UpdateQuotePayload withDateCreated(String dateCreated) {
        append("datecreated", dateCreated);
        return this;
    }

    /***
     *
     * @param lineItems A base64 encoded serialized array containing the following keys:
     */
    public UpdateQuotePayload withLineItems(JSONObject lineItems) {
        append("lineitems", lineItems);
        return this;
    }

    /***
     *
     * @param lineItems_x__id_ For $lineitems. The id of an existing line item. Omit for new lines
     */
    public UpdateQuotePayload withLineItems_x__id_(int lineItems_x__id_) {
        append("lineitems[x][id]", lineItems_x__id_);
        return this;
    }

    /***
     *
     * @param lineItems_x__desc_ For $lineitems. The description of the line item
     */
    public UpdateQuotePayload withLineItems_x__desc_(String lineItems_x__desc_) {
        append("lineitems[x][desc]", lineItems_x__desc_);
        return this;
    }

    /***
     *
     * @param lineItems_x__qty_ For $lineitems. The quantity of the line item being quoted for
     */
    public UpdateQuotePayload withLineItems_x__qty_(int lineItems_x__qty_) {
        append("lineitems[x][qty]", lineItems_x__qty_);
        return this;
    }

    /***
     *
     * @param lineItems_x__up_ For $lineitems. The Unit Price of the line item
     */
    public UpdateQuotePayload withLineItems_x__up_(float lineItems_x__up_) {
        append("lineitems[x][up]", lineItems_x__up_);
        return this;
    }

    /***
     *
     * @param lineitems_x__discount_ For $lineitems. The amount of discount to provide on the line items
     */
    public UpdateQuotePayload withLineItems_x__discount_(float lineitems_x__discount_) {
        append("lineitems[x][discount]", lineitems_x__discount_);
        return this;
    }

    /***
     *
     * @param lineItems_x__taxable_ For $lineitems. Is the line item taxable
     */
    public UpdateQuotePayload withLineItems_x__taxable_	(boolean lineItems_x__taxable_) {
        append("lineitems[x][taxable]", lineItems_x__taxable_);
        return this;
    }

    /***
     *
     * @param userID If the quote is for an exising client, the client ID the quote is for
     */
    public UpdateQuotePayload withUserID(int userID) {
        append("userid", userID);
        return this;
    }

    /***
     *
     * @param firstName The first name of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withFirstName(String firstName) {
        append("firstname", firstName);
        return this;
    }

    /***
     *
     * @param lastName The last name of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withLastName(String lastName) {
        append("lastname", lastName);
        return this;
    }

    /***
     *
     * @param companyName The company of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withCompanyName(String companyName) {
        append("companyname", companyName);
        return this;
    }

    /***
     *
     * @param email The email address of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withEmail(String email) {
        append("email", email);
        return this;
    }

    /***
     *
     * @param address1 The address1 of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withAddress1(String address1) {
        append("address1", address1);
        return this;
    }

    /***
     *
     * @param address2 The address2 of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withAddress2(String address2) {
        append("address2", address2);
        return this;
    }

    /***
     *
     * @param city The city of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withCity(String city) {
        append("city", city);
        return this;
    }

    /***
     *
     * @param state The state of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withState(String state) {
        append("state", state);
        return this;
    }

    /***
     *
     * @param country The country of the client the quote is for if no $userid
     */
    public UpdateQuotePayload withCountry(String country) {
        append("country", country);
        return this;
    }

    /***
     *
     * @param phoneNumber The phone number of the client (no country code) the quote is for if no $userid. Local format eg 4035551234
     */
    public UpdateQuotePayload withPhoneNumber(String phoneNumber) {
        append("phonenumber", phoneNumber);
        return this;
    }

    /***
     *
     * @param currency The id of the currency for the quote is for if no $userid
     */
    public UpdateQuotePayload withCurrency(int currency) {
        append("currency", currency);
        return this;
    }

    /***
     *
     * @param proposal The proposal text displayed to the end user
     */
    public UpdateQuotePayload withProposal(String proposal) {
        append("proposal", proposal);
        return this;
    }

    /***
     *
     * @param customErnotes The notes on the quote displayed to the end user
     */
    public UpdateQuotePayload withCustomErnotes(String customErnotes) {
        append("customernotes", customErnotes);
        return this;
    }

    /***
     *
     * @param adminNotes The notes on the quote displayed to the staff only
     */
    public UpdateQuotePayload withAdminNotes(String adminNotes) {
        append("adminnotes", adminNotes);
        return this;
    }
}
