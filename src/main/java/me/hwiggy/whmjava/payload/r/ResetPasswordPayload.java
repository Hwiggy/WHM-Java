package me.hwiggy.whmjava.payload.r;

import me.hwiggy.whmjava.payload.Payload;

public class ResetPasswordPayload extends Payload {
    public ResetPasswordPayload() {
        super("ResetPassword");
    }

    /***
     * @param id    The id of the client to reset. The id can only belong to a client.	Optional
     */
    public ResetPasswordPayload withId(int id) {
        append("id", id);
        return this;
    }

    /***
     * @param email    The email address of the client or contact to update. Either $id or $email is required	Optional
     */
    public ResetPasswordPayload withEmail(String email) {
        append("email", email);
        return this;
    }

    /***
     * @param answer    The answer to the client security question if appropriate	Optional
     */
    public ResetPasswordPayload withAnswer(String answer) {
        append("answer", answer);
        return this;
    }
}
