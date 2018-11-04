package me.hwiggy.whmjava.payload.v;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addticketreply/
 */

public class ValidateLoginPayload extends Payload {


    /***
    *
    * @param email the email adderess to validate.
    * @param password2 the password for the email to validate.
    *
     */

    public ValidateLoginPayload(String email, String password2) {
        super("ValidateLogin");
        append("email", email);
        append("password2", password2);
    }


    //todo javadocs


}
