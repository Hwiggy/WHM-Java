package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addprojecttask/
 */
public class AddProjectTaskPayload extends Payload {

    /***
     *
     * @param projectID The id of the project the task is for
     * @param dueDate The duedate for the task. Format YYYY-mm-dd
     */
    public AddProjectTaskPayload(int projectID, String dueDate) {
        super("AddProjectTask");
        append("projectid", projectID);
        append("duedate", dueDate);
    }

    /***
     *
     * @param adminID The admin id to associate the task with
     * @return This Payload, for chaining
     */
    public AddProjectTaskPayload withAdminID(int adminID){
        append("adminid",adminID);
        return this;
    }

    /***
     *
     * @param task The task title
     * @return This Payload, for chaining
     */
    public AddProjectTaskPayload withTask(String task){
        append("task", task);
        return this;
    }

    /***
     *
     * @param notes The notes for the task
     * @return This Payload, for chaining
     */
    public AddProjectTaskPayload withNotes(String notes){
        append("notes", notes);
        return this;
    }

    /***
     *
     * @param completed Has the task been completed
     * @return This Payload, for chaining
     */
    public AddProjectTaskPayload withCompleted(boolean completed){
        append("completed", completed);
        return this;
    }

    /***
     *
     * @param billed Has the task been billed
     * @return This Payload, for chaining
     */
    public AddProjectTaskPayload withBilled(boolean billed){
        append("billed", billed);
        return this;
    }
}
