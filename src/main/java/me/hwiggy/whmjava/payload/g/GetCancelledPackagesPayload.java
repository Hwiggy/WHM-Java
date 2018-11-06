package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getcancelledpackages/
 */
public class GetCancelledPackagesPayload extends Payload {
    public GetCancelledPackagesPayload() {
        super("GetCancelledPackages");
    }

    public GetCancelledPackagesPayload withLimitStart(int limitStart) {
        append("limitstart", limitStart);
        return this;
    }

    public GetCancelledPackagesPayload withLimitNum(int limitNum) {
        append("limitnum", limitNum);
        return this;
    }
}
