package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getautomationlog/
 */
public class GetAutomationLogPayload extends Payload {
    public GetAutomationLogPayload() {
        super("GetAutomationLog");
    }

    public GetAutomationLogPayload withStartDate(String startDate) {
        append("startdate", startDate);
        return this;
    }

    public GetAutomationLogPayload withEndDate(String endDate) {
        append("enddate", endDate);
        return this;
    }

    public GetAutomationLogPayload withNameSpace(String nameSpace) {
        append("namespace", nameSpace);
        return this;
    }
}
