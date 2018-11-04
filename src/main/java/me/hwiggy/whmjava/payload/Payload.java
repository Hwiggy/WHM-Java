package me.hwiggy.whmjava.payload;

import org.json.JSONObject;

public abstract class Payload extends JSONObject{

    Payload(String action){
        super();
        append("action", action);
    }

}
