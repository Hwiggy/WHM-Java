package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 * ￼* https://developers.whmcs.com/api-reference/getactivitylog/
 */
public class GetActivityLogPayload extends Payload {
    public GetActivityLogPayload() {
        super("GetActivityLog");
    }

    /***
     * @param limitStart    The offset for the returned log data (default: 0)
     */
    public GetActivityLogPayload withLimitstart(int limitStart) {
        put("limitstart", limitStart);
        return this;
    }

    /***
     * @param limitNum    The number of records to return (default: 25)
     */
    public GetActivityLogPayload withLimitNum(int limitNum) {
        put("limitnum", limitNum);
        return this;
    }

    /***
     * @param userID    The ID of the user to obtain the log for
     */
    public GetActivityLogPayload withUserID(int userID) {
        put("userid", userID);
        return this;
    }

    /***
     * @param date    The date of the activity log to retrieve in localised format (eg 01/01/2016)	
     */
    public GetActivityLogPayload withDate(String date) {
        put("date", date);
        return this;
    }

    /***
     * @param user    The name of the user to retrieve the log entries for	
     */
    public GetActivityLogPayload withUser(String user) {
        put("user", user);
        return this;
    }

    /***
     * @param description    Search the log for a specific string	
     */
    public GetActivityLogPayload withDescription(String description) {
        put("description", description);
        return this;
    }

    /***
     * @param ipaddress    The IP Address to search the activity log for	
     */
    public GetActivityLogPayload withIPAddress(String ipaddress) {
        put("ipaddress", ipaddress);
        return this;
    }
}
