package me.hwiggy.whmjava.payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addannouncement/
 */
public class AddAnnouncementPayload extends Payload {

    /***
     *
     * @param date Date in the format YYYY-MM-DD HH:MM:SS
     * @param title The title of this announcement
     * @param announcement Announcement text
     */
    AddAnnouncementPayload(String date, String title, String announcement) {
        super("AddAnnouncement");
        append("date", date);
        append("title", title);
        append("announcement", announcement);
    }

    /***
     *
     * @param published Pass as true to publish
     * @return This Payload, for chaining
     */
    public AddAnnouncementPayload isPublished(boolean published){
        append("published", published);
        return this;
    }
}
