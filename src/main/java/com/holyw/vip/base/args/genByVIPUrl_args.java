package com.holyw.vip.base.args;

import com.vip.adp.api.open.service.UrlGenRequest;

import java.util.List;

/**
 * @className: genByVIPUrl_args
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public class genByVIPUrl_args extends Args{
    private List<String> urlList;
    private String chanTag;
    private String requestId;
    private String statParam;
    private UrlGenRequest urlGenRequest;

    public genByVIPUrl_args() {
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public void setUrlList(List<String> value) {
        this.urlList = value;
    }

    public String getChanTag() {
        return this.chanTag;
    }

    public void setChanTag(String value) {
        this.chanTag = value;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String value) {
        this.requestId = value;
    }

    public String getStatParam() {
        return this.statParam;
    }

    public void setStatParam(String value) {
        this.statParam = value;
    }

    public UrlGenRequest getUrlGenRequest() {
        return this.urlGenRequest;
    }

    public void setUrlGenRequest(UrlGenRequest value) {
        this.urlGenRequest = value;
    }

}
