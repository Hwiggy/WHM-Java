package me.hwiggy.whmjava.payload.c;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/createproject/
 */
public class CreateProjectPayload extends Payload {

    /***
     *
     * @param title The title of the new project
     * @param adminID The adminId the project will be associated with
     */
    public CreateProjectPayload(String title, int adminID) {
        super("CreateProject");
        put("title", title);
        put("adminid", adminID);
    }

    /***
     *
     * @param userID The user that the project is for
     * @return This Payload, for chaining
     */
    public CreateProjectPayload withUserID(int userID){
        put("userid", userID);
        return this;
    }

    /***
     *
     * @param status The status of the project as defined in Project Management Settings
     * @return This Payload, for chaining
     */
    public CreateProjectPayload withStatus(String status){
        put("status", status);
        return this;
    }

    /***
     *
     * @param created The created date of the project in Y-m-d format
     * @return This Payload, for chaining
     */
    public CreateProjectPayload withCreated(String created){
        put("created", created);
        return this;
    }

    /***
     *
     * @param dueDate The duedate date of the project in Y-m-d format
     * @return This Payload, for chaining
     */
    public CreateProjectPayload withDueDate(String dueDate){
        put("duedate", dueDate);
        return this;
    }

    /***
     *
     * @param completed Is the project completed
     * @return This Payload, for chaining
     */
    public CreateProjectPayload withCompleted(boolean completed){
        put("completed", completed);
        return this;
    }

    /***
     *
     * @param ticketIDs A comma separated list of ticket IDs to associate with the project
     * @return This Payload, for chaining
     */
    public CreateProjectPayload withTicketIDs(String ticketIDs){
        put("ticketids", ticketIDs);
        return this;
    }

    /***
     *
     * @param invoiceIDs A comma separated list of invoice IDs to associate with the project
     * @return This Payload, for chaining
     */
    public CreateProjectPayload withInvoiceIDs(String invoiceIDs){
        put("invoiceids", invoiceIDs);
        return this;
    }
}
