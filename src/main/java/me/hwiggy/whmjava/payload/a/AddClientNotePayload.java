package me.hwiggy.whmjava.payload.a;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addclientnote/
 */
public class AddClientNotePayload extends Payload {

    /***
     *
     * @param userID The Client ID to apply the note to
     * @param note The note to add
     */
    public AddClientNotePayload(int userID, String note) {
        super("AddClientNote");
        put("userid", userID);
        put("notes", note);
    }

    /***
     *
     * @param sticky Should the note be made sticky. Makes the note ‘sticky’ and displays the note throughout the client’s account and on any tickets they submit in the admin area
     * @return This Payload, for chaining
     */
    public AddClientNotePayload withSticky(boolean sticky){
        put("sticky", sticky);
        return this;
    }
}
