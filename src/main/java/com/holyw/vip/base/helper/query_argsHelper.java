package com.holyw.vip.base.helper;

import com.holyw.vip.base.args.query_args;
import com.holyw.vip.request.QueryGoodsRequest;
import com.holyw.vip.request.builder.QueryGoodsRequestBuilder;
import com.vip.adp.api.open.service.QueryGoodsRequestHelper;
import com.vip.adp.api.open.service.UnionGoodsServiceHelper;
import com.vip.osp.sdk.base.TBeanSerializer;
import com.vip.osp.sdk.exception.OspException;
import com.vip.osp.sdk.protocol.Protocol;

/**
 * @className: query_argsHelper
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public class query_argsHelper implements TBeanSerializer<query_args> {
    public static final query_argsHelper OBJ = new query_argsHelper();

    public query_argsHelper() {
    }

    public static query_argsHelper getInstance() {
        return OBJ;
    }


    @Override
    public void read(query_args struct, Protocol protocol) throws OspException {
        QueryGoodsRequest value = new QueryGoodsRequestBuilder().build();
        QueryGoodsRequestHelper.getInstance().read(value, protocol);
        struct.setRequest(value);
        this.validate(struct);
    }

    @Override
    public void write(query_args query_args, Protocol protocol) throws OspException {

    }

    @Override
    public void validate(query_args query_args) throws OspException {

    }
}