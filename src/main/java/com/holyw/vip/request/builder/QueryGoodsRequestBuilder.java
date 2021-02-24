package com.holyw.vip.request.builder;

import com.holyw.vip.request.QueryGoodsRequest;

import java.util.UUID;

/**
 * @className: QueryGoodsRequestBuilder
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public class QueryGoodsRequestBuilder {
    private QueryGoodsRequest queryGoodsRequest = new QueryGoodsRequest();

    public QueryGoodsRequest build() {
        queryGoodsRequest.setRequestId(UUID.randomUUID().toString().replace("-", ""));
        return queryGoodsRequest;
    }

    public QueryGoodsRequestBuilder addKeyword(String keyword) {
        queryGoodsRequest.setKeyword(keyword);
        return this;
    }


    public QueryGoodsRequestBuilder addPage(Integer page) {
        queryGoodsRequest.setPage(page);
        return this;
    }

    public QueryGoodsRequestBuilder addPageSize(Integer pageSize) {
        queryGoodsRequest.setPageSize(pageSize);
        return this;
    }

    //TODO

}
