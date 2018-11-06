package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

public class GetEmailsPayload extends Payload {

    /***
     *
     * @param clientID The Client ID to retrieve the emails for
     */
    public GetEmailsPayload(int clientID) {
        super("GetEmails");
        append("clientid", clientID);
    }

    /***
     * @param limitStart    The offset for the returned log data (default: 0)	Optional
     */
    public GetEmailsPayload withLimitStart(int limitStart) {
        append("limitstart", limitStart);
        return this;
    }

    /***
     * @param limitNum    The number of records to return (default: 25)	Optional
     */
    public GetEmailsPayload withLimitNum(int limitNum) {
        append("limitnum", limitNum);
        return this;
    }

    /***
     * @param date    The date to retrieve emails for.	Optional
     */
    public GetEmailsPayload withDate(String date) {
        append("date", date);
        return this;
    }

    /***
     * @param subject    The subject to retrieve emails for - uses approximate string matching.	Optional
     */
    public GetEmailsPayload withSubject(String subject) {
        append("subject", subject);
        return this;
    }

}
