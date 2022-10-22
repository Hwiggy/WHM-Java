package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getaffiliates/
 */
public class GetAffiliatesPayload extends Payload {
    public GetAffiliatesPayload() {
        super("GetAffiliates");
    }

    /***
     * @param limitStart    The offset for the returned affiliate data (default: 0)	Optional
     */
    public GetAffiliatesPayload withLimitStart(int limitStart) {
        put("limitstart", limitStart);
        return this;
    }

    /***
     * @param limitNum    The number of records to return (default: 25)	Optional
     */
    public GetAffiliatesPayload withLimitNum(int limitNum) {
        put("limitnum", limitNum);
        return this;
    }

    /***
     * @param userID    Obtain affiliate data for a specific client account	Optional
     */
    public GetAffiliatesPayload withUserID(int userID) {
        put("userid", userID);
        return this;
    }

    /***
     * @param visitors    Provide affiliates that match a specific visitor count	Optional
     */
    public GetAffiliatesPayload withVisitors(int visitors) {
        put("visitors", visitors);
        return this;
    }

    /***
     * @param payType    Provide affiliates matching the paytype provided. One of “, ‘percentage’, ‘fixedamount’	Optional
     */
    public GetAffiliatesPayload withPayYype(String payType) {
        put("paytype", payType);
        return this;
    }

    /***
     * @param payAmount    Provide affiliates matching a specific overridden payout amount	Optional
     */
    public GetAffiliatesPayload withPayAmount(float payAmount) {
        put("payamount", payAmount);
        return this;
    }

    /***
     * @param oneTime    Provide affiliates configured to receive one time affiliates	Optional
     */
    public GetAffiliatesPayload withOneTime(int oneTime) {
        put("onetime", oneTime);
        return this;
    }

    /***
     * @param balance    Provide affiliates that have this balance	Optional
     */
    public GetAffiliatesPayload withBalance(float balance) {
        put("balance", balance);
        return this;
    }

    /***
     * @param withDrawn    Provide affiliates that have withdrawn this amount	Optional
     */
    public GetAffiliatesPayload withWithDrawn(float withDrawn) {
        put("withdrawn", withDrawn);
        return this;
    }
}
