package me.hwiggy.whmjava.payload.d;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/decryptpassword/
 */
public class DecryptPasswordPayload extends Payload {

    /***
     *
     * @param password The string to decrypt
     */
    public DecryptPasswordPayload(String password) {
        super("DecryptPassword");
        put("password2", password);
    }
}
