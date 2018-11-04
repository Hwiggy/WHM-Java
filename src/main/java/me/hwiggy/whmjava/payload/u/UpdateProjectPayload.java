package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateproject/
 */

public class UpdateProjectPayload extends Payload {

    /***
     *
     * @param projectID The project ID to update
     */

    public UpdateProjectPayload(int projectID) {
        super("UpdateProject");
        append("projectid", projectID);
    }

    /***
     *
     * @param adminID The adminId the project will be associated with
     */
    public UpdateProjectPayload withAdminID(int adminID) {
        append("adminid", adminID);
        return this;
    }

    /***
     *
     * @param userID The user that the project is for
     */
    public UpdateProjectPayload withUserID(int userID) {
        append("userid", userID);
        return this;
    }

    /***
     *
     * @param status The status of the project as defined in Project Management Settings
     */
    public UpdateProjectPayload withStatus(String  status) {
        append("status",status);
        return this;
    }

    /***
     *
     * @param created The created date of the project in Y-m-d format
     */
    public UpdateProjectPayload withCreated(String created) {
        append("created", created);
        return this;
    }

    /***
     *
     * @param duedate The due date of the project in Y-m-d format
     */
    public UpdateProjectPayload withDueDate(String duedate) {
        append("duedate", duedate);
        return this;
    }

    /***
     *
     * @param completed Is the project completed
     */
    public UpdateProjectPayload withCompleted(boolean completed) {
        append("completed", completed);
        return this;
    }

    /***
     *
     * @param title The title of the project
     */
    public UpdateProjectPayload withTitle(String title) {
        append("title", title);
        return this;
    }

    /***
     *
     * @param tickeIDs A comma separated list of ticket IDs to associate with the project
     */
    public UpdateProjectPayload withtickeIDs(String tickeIDs) {
        append("ticketids", tickeIDs);
        return this;
    }

    /***
     *
     * @param invoiceids A comma separated list of invoice IDs to associate with the project
     */
    public UpdateProjectPayload withInvoiceIDs(String invoiceids) {
        append("invoiceids", invoiceids);
        return this;
    }

    /***
     *
     * @param notes The notes to associate with the project
     */
    public UpdateProjectPayload withNotes(String notes) {
        append("notes", notes);
        return this;
    }
}
