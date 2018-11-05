package me.hwiggy.whmjava.payload.s;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/starttasktimer/
 */
public class StartTaskTimerPayload extends Payload {
    public StartTaskTimerPayload(int timerID, int projectID) {
        super("StartTaskTimer");
        append("projectid", projectID);
        append("timerid", timerID);
    }

    /***
     * @param adminID    The admin ID to associate the timer with	
     */
    public StartTaskTimerPayload withAdminID(int adminID) {
        append("adminid", adminID);
        return this;
    }

    /***
     * @param start_time    The start time as a unix time stamp. Defaults to time() if not provIDed	
     */
    public StartTaskTimerPayload withStart_time(int start_time) {
        append("start_time", start_time);
        return this;
    }

    /***
     * @param end_time    The start time as a unix time stamp.	
     */
    public StartTaskTimerPayload withEnd_time(int end_time) {
        append("end_time", end_time);
        return this;
    }
}
