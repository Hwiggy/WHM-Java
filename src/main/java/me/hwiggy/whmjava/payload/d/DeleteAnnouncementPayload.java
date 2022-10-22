package me.hwiggy.whmjava.payload.d;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/deleteannouncement/
 */
public class DeleteAnnouncementPayload extends Payload {

    /***
     *
     * @param announcementID The ID of the announcement to be deleted
     */
    public DeleteAnnouncementPayload(int announcementID) {
        super("DeleteAnnouncement");
        put("announcementid", announcementID);
    }
}
