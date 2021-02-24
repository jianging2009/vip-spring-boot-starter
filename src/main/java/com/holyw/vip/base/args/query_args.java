package com.holyw.vip.base.args;

import com.holyw.vip.request.Request;
import com.vip.adp.api.open.service.QueryGoodsRequest;

/**
 * @className: query_args
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public class query_args extends Args{

    public query_args() {
    }

    public Request getRequest() {
        return this.request;
    }

    public void setRequest(Request value) {
        this.request = value;
    }
}
