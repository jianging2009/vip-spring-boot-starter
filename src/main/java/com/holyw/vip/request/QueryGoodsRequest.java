package com.holyw.vip.request;

import com.vip.adp.api.open.service.CommonParams;

/**
 * @className: QueryGoodsRequest
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public class QueryGoodsRequest implements Request{
    private String keyword;
    private String fieldName;
    private Integer order;
    private Integer page;
    private Integer pageSize;
    private String requestId;
    private String priceStart;
    private String priceEnd;
    private Boolean queryReputation;
    private Boolean queryStoreServiceCapability;
    private Boolean queryStock;
    private Boolean queryActivity;
    private Boolean queryPrepay;
    private CommonParams commonParams;
    private String vendorCode;
    private String chanTag;

    public QueryGoodsRequest() {
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String value) {
        this.keyword = value;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer value) {
        this.order = value;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setPage(Integer value) {
        this.page = value;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String value) {
        this.requestId = value;
    }

    public String getPriceStart() {
        return this.priceStart;
    }

    public void setPriceStart(String value) {
        this.priceStart = value;
    }

    public String getPriceEnd() {
        return this.priceEnd;
    }

    public void setPriceEnd(String value) {
        this.priceEnd = value;
    }

    public Boolean getQueryReputation() {
        return this.queryReputation;
    }

    public void setQueryReputation(Boolean value) {
        this.queryReputation = value;
    }

    public Boolean getQueryStoreServiceCapability() {
        return this.queryStoreServiceCapability;
    }

    public void setQueryStoreServiceCapability(Boolean value) {
        this.queryStoreServiceCapability = value;
    }

    public Boolean getQueryStock() {
        return this.queryStock;
    }

    public void setQueryStock(Boolean value) {
        this.queryStock = value;
    }

    public Boolean getQueryActivity() {
        return this.queryActivity;
    }

    public void setQueryActivity(Boolean value) {
        this.queryActivity = value;
    }

    public Boolean getQueryPrepay() {
        return this.queryPrepay;
    }

    public void setQueryPrepay(Boolean value) {
        this.queryPrepay = value;
    }

    public CommonParams getCommonParams() {
        return this.commonParams;
    }

    public void setCommonParams(CommonParams value) {
        this.commonParams = value;
    }

    public String getVendorCode() {
        return this.vendorCode;
    }

    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    public String getChanTag() {
        return this.chanTag;
    }

    public void setChanTag(String value) {
        this.chanTag = value;
    }

}
