package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addcprojectmessage/
 */
public class AddProjectMessagePayload extends Payload {

    /***
     *
     * @param projectID The id of the project the message is for
     * @param message The message to add to the project
     */
    public AddProjectMessagePayload(int projectID, String message) {
        super("AddProjectMessage");
        put("projectid", projectID);
        put("message", message);
    }

    /***
     *
     * @param adminID Override the admin id for the message. Not passing will set to the adminid of the api request
     * @return This Payload, for chaining
     */
    public AddProjectMessagePayload withAdminID(int adminID){
        put("adminid", adminID);
        return this;
    }
}
