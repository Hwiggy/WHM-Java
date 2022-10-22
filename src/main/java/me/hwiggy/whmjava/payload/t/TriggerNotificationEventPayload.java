package me.hwiggy.whmjava.payload.t;

import me.hwiggy.whmjava.payload.Payload;
import org.json.JSONObject;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/triggernotificationevent/
 */
public class TriggerNotificationEventPayload extends Payload {

    public TriggerNotificationEventPayload() {
        super("TriggerNotificationEvent");
    }

    /***
     * @param notification_identifier    A unique identifier String, used as a condition when making a notification rule.	
     */
    public TriggerNotificationEventPayload withNotification_identifier(String notification_identifier) {
        put("notification_identifier", notification_identifier);
        return this;
    }

    /***
     * @param title    The title for the notification	
     */
    public TriggerNotificationEventPayload withTitle(String title) {
        put("title", title);
        return this;
    }

    /***
     * @param message    The message body for the notification	
     */
    public TriggerNotificationEventPayload withMessage(String message) {
        put("message", message);
        return this;
    }

    /***
     * @param url    The follow up URL for the notification	
     */
    public TriggerNotificationEventPayload withUrl(String url) {
        put("url", url);
        return this;
    }

    /***
     * @param status    A status description for the notification	
     */
    public TriggerNotificationEventPayload withStatus(String status) {
        put("status", status);
        return this;
    }

    /***
     * @param statusStyle    A formatting style for the status of the notification, currently supports “success”, “danger”, and “info”	
     */
    public TriggerNotificationEventPayload withStatusStyle(String statusStyle) {
        put("statusStyle", statusStyle);
        return this;
    }

    /***
     * @param attributes    An array of Attributes to include in the notification. Requires at least label and value parameters. Other parameters are . See WHMCS\Notification\NotificationAttribute.	
     */
    public TriggerNotificationEventPayload withAttributes(JSONObject attributes) {
        put("attributes", attributes);
        return this;
    }
}
