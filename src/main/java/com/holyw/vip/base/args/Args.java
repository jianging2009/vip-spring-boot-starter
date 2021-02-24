package com.holyw.vip.base.args;

import com.holyw.vip.request.Request;

/**
 * @className: Args
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public abstract class Args {
    protected Request request;

    public void setRequest(Request request) {
        this.request = request;
    }
}
