package me.hwiggy.whmjava.payload.v;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/validatelogin/
 */

public class ValidateLoginPayload extends Payload {

    /***
    *
    * @param email The email address to validate.
    * @param password The password to validate for the $email.
    *
     */
    public ValidateLoginPayload(String email, String password) {
        super("ValidateLogin");
        put("email", email);
        put("password2", password);
    }
}
