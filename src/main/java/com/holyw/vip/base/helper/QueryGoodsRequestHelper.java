package com.holyw.vip.base.helper;

import com.vip.adp.api.open.service.CommonParams;
import com.vip.adp.api.open.service.CommonParamsHelper;
import com.vip.adp.api.open.service.QueryGoodsRequest;
import com.vip.osp.sdk.base.TBeanSerializer;
import com.vip.osp.sdk.exception.OspException;
import com.vip.osp.sdk.protocol.Protocol;
import com.vip.osp.sdk.protocol.ProtocolUtil;

/**
 * @className: QueryGoodsRequestHelper
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public class QueryGoodsRequestHelper implements TBeanSerializer<QueryGoodsRequest> {
    public static final com.vip.adp.api.open.service.QueryGoodsRequestHelper OBJ = new com.vip.adp.api.open.service.QueryGoodsRequestHelper();

    public QueryGoodsRequestHelper() {
    }

    public static com.vip.adp.api.open.service.QueryGoodsRequestHelper getInstance() {
        return OBJ;
    }

    public void read(QueryGoodsRequest struct, Protocol iprot) throws OspException {
        String schemeStruct = iprot.readStructBegin();
        if (schemeStruct != null) {
            while(true) {
                String schemeField = iprot.readFieldBegin();
                if (schemeField == null) {
                    iprot.readStructEnd();
                    this.validate(struct);
                    return;
                }

                boolean needSkip = true;
                String value;
                if ("keyword".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readString();
                    struct.setKeyword(value);
                }

                if ("fieldName".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readString();
                    struct.setFieldName(value);
                }

                Integer value;
                if ("order".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readI32();
                    struct.setOrder(value);
                }

                if ("page".equals(schemeField.trim())) {
                    needSkip = false;
                    int value = iprot.readI32();
                    struct.setPage(value);
                }

                if ("pageSize".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readI32();
                    struct.setPageSize(value);
                }

                if ("requestId".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readString();
                    struct.setRequestId(value);
                }

                if ("priceStart".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readString();
                    struct.setPriceStart(value);
                }

                if ("priceEnd".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readString();
                    struct.setPriceEnd(value);
                }

                Boolean value;
                if ("queryReputation".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readBool();
                    struct.setQueryReputation(value);
                }

                if ("queryStoreServiceCapability".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readBool();
                    struct.setQueryStoreServiceCapability(value);
                }

                if ("queryStock".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readBool();
                    struct.setQueryStock(value);
                }

                if ("queryActivity".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readBool();
                    struct.setQueryActivity(value);
                }

                if ("queryPrepay".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readBool();
                    struct.setQueryPrepay(value);
                }

                if ("commonParams".equals(schemeField.trim())) {
                    needSkip = false;
                    CommonParams value = new CommonParams();
                    CommonParamsHelper.getInstance().read(value, iprot);
                    struct.setCommonParams(value);
                }

                if ("vendorCode".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readString();
                    struct.setVendorCode(value);
                }

                if ("chanTag".equals(schemeField.trim())) {
                    needSkip = false;
                    value = iprot.readString();
                    struct.setChanTag(value);
                }

                if (needSkip) {
                    ProtocolUtil.skip(iprot);
                }

                iprot.readFieldEnd();
            }
        } else {
            throw new OspException();
        }
    }

    public void write(QueryGoodsRequest struct, Protocol oprot) throws OspException {
        this.validate(struct);
        oprot.writeStructBegin();
        if (struct.getKeyword() != null) {
            oprot.writeFieldBegin("keyword");
            oprot.writeString(struct.getKeyword());
            oprot.writeFieldEnd();
            if (struct.getFieldName() != null) {
                oprot.writeFieldBegin("fieldName");
                oprot.writeString(struct.getFieldName());
                oprot.writeFieldEnd();
            }

            if (struct.getOrder() != null) {
                oprot.writeFieldBegin("order");
                oprot.writeI32(struct.getOrder());
                oprot.writeFieldEnd();
            }

            if (struct.getPage() != null) {
                oprot.writeFieldBegin("page");
                oprot.writeI32(struct.getPage());
                oprot.writeFieldEnd();
                if (struct.getPageSize() != null) {
                    oprot.writeFieldBegin("pageSize");
                    oprot.writeI32(struct.getPageSize());
                    oprot.writeFieldEnd();
                }

                if (struct.getRequestId() != null) {
                    oprot.writeFieldBegin("requestId");
                    oprot.writeString(struct.getRequestId());
                    oprot.writeFieldEnd();
                    if (struct.getPriceStart() != null) {
                        oprot.writeFieldBegin("priceStart");
                        oprot.writeString(struct.getPriceStart());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getPriceEnd() != null) {
                        oprot.writeFieldBegin("priceEnd");
                        oprot.writeString(struct.getPriceEnd());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getQueryReputation() != null) {
                        oprot.writeFieldBegin("queryReputation");
                        oprot.writeBool(struct.getQueryReputation());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getQueryStoreServiceCapability() != null) {
                        oprot.writeFieldBegin("queryStoreServiceCapability");
                        oprot.writeBool(struct.getQueryStoreServiceCapability());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getQueryStock() != null) {
                        oprot.writeFieldBegin("queryStock");
                        oprot.writeBool(struct.getQueryStock());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getQueryActivity() != null) {
                        oprot.writeFieldBegin("queryActivity");
                        oprot.writeBool(struct.getQueryActivity());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getQueryPrepay() != null) {
                        oprot.writeFieldBegin("queryPrepay");
                        oprot.writeBool(struct.getQueryPrepay());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getCommonParams() != null) {
                        oprot.writeFieldBegin("commonParams");
                        CommonParamsHelper.getInstance().write(struct.getCommonParams(), oprot);
                        oprot.writeFieldEnd();
                    }

                    if (struct.getVendorCode() != null) {
                        oprot.writeFieldBegin("vendorCode");
                        oprot.writeString(struct.getVendorCode());
                        oprot.writeFieldEnd();
                    }

                    if (struct.getChanTag() != null) {
                        oprot.writeFieldBegin("chanTag");
                        oprot.writeString(struct.getChanTag());
                        oprot.writeFieldEnd();
                    }

                    oprot.writeFieldStop();
                    oprot.writeStructEnd();
                } else {
                    throw new OspException("OSP_CALLEE_UNKNOWN_EXCEPTION", "requestId can not be null!");
                }
            } else {
                throw new OspException("OSP_CALLEE_UNKNOWN_EXCEPTION", "page can not be null!");
            }
        } else {
            throw new OspException("OSP_CALLEE_UNKNOWN_EXCEPTION", "keyword can not be null!");
        }
    }

    public void validate(QueryGoodsRequest bean) throws OspException {
    }
}
