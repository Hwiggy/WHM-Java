package me.hwiggy.whmjava.payload.u;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateprojecttask/
 */

public class UpdateProjectTaskPayload extends Payload {

    /***
     *
     * @param taskID The id of the project task to update
     */
    public UpdateProjectTaskPayload(int taskID) {
        super("UpdateProjectTask");
        put("taskid", taskID);
    }

    /***
     *
     * @param projectID Change the project a task is assigned to
     */
    public UpdateProjectTaskPayload withProjectID(int projectID) {
        put("projectid", projectID);
        return this;
    }

    /***
     *
     * @param dueDate The duedate for the task. Format YYYY-mm-dd
     */
    public UpdateProjectTaskPayload withDueDate(String dueDate) {
        put("duedate", dueDate);
        return this;
    }

    /***
     *
     * @param adminID The admin id to associate the task with
     */
    public UpdateProjectTaskPayload withAdminID(int adminID) {
        put("adminid", adminID);
        return this;
    }

    /***
     *
     * @param task The task title
     */
    public UpdateProjectTaskPayload withTask(String task) {
        put("task", task);
        return this;
    }

    /***
     *
     * @param notes The notes for the task
     */
    public UpdateProjectTaskPayload withNotes(String notes) {
        put("notes", notes);
        return this;
    }

    /***
     *
     * @param completed Has the task been completed
     */
    public UpdateProjectTaskPayload withCompleted(boolean completed) {
        put("completed", completed);
        return this;
    }
}
