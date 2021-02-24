package com.holyw.vip.base;

import com.holyw.vip.base.args.Args;
import com.vip.adp.api.open.service.*;
import com.vip.hermes.core.health.CheckResult;
import com.vip.osp.sdk.base.OspRestStub;
import com.vip.osp.sdk.exception.OspException;

import java.util.List;

/**
 * @className: VipUnionServiceClient
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/2/24
 **/
public class VipUnionServiceClient  extends OspRestStub implements UnionGoodsService{
    public VipUnionServiceClient(String version, String serviceName) {
        super(version, serviceName);
    }

    @Override
    public List<GoodsInfo> getByGoodsIds(List<String> list, String s, String s1) throws OspException {
        //TODO
        return null;
    }

    @Override
    public List<GoodsInfo> getByGoodsIdsV2(GetByGoodsIdsRequest getByGoodsIdsRequest) throws OspException {
        //TODO
        return null;
    }

    @Override
    public List<GoodsInfo> getByGoodsIdsV2WithOauth(GetByGoodsIdsRequest getByGoodsIdsRequest) throws OspException {
        //TODO
        return null;
    }

    @Override
    public List<GoodsInfo> getByGoodsIdsWithOauth(List<String> list, String s, String s1) throws OspException {
        //TODO
        return null;
    }

    @Override
    public CategoryResponse getCategorys(CategoryRequest categoryRequest) throws OspException {
        //TODO
        return null;
    }

    @Override
    public GoodsInfoResponse goodsList(GoodsInfoRequest goodsInfoRequest) throws OspException {
        //TODO
        return null;
    }

    @Override
    public GoodsInfoResponse goodsListWithOauth(GoodsInfoRequest goodsInfoRequest) throws OspException {
        //TODO
        return null;
    }

    @Override
    public CheckResult healthCheck() throws OspException {
        return null;
    }

    @Override
    public GoodsInfoResponse query(QueryGoodsRequest queryGoodsRequest) throws OspException {

        return null;
    }

    @Override
    public GoodsInfoResponse queryWithOauth(QueryGoodsRequest queryGoodsRequest) throws OspException {
        return null;
    }

    @Override
    public GoodsInfoResponse similarRecommend(SimilarRecommendRequest similarRecommendRequest) throws OspException {
        return null;
    }

    @Override
    public GoodsInfoResponse similarRecommendWithOauth(SimilarRecommendRequest similarRecommendRequest) throws OspException {
        return null;
    }

    @Override
    public GoodsInfoResponse userRecommend(UserRecommendRequest userRecommendRequest) throws OspException {
        return null;
    }

    @Override
    public GoodsInfoResponse userRecommendWithOauth(UserRecommendRequest userRecommendRequest) throws OspException {
        return null;
    }


    private void send_query(com.holyw.vip.request.QueryGoodsRequest request,String method) throws OspException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //this.initInvocation("query");
        this.initInvocation("method");
        Args args = (Args)Class.forName(method+"_args").newInstance();
        args.setRequest(request);

        UnionGoodsServiceHelper.goodsList_args args2 = new UnionGoodsServiceHelper.goodsList_args();
        super.sendBase(args, UnionGoodsServiceHelper.query_argsHelper.getInstance());
    }

    private GoodsInfoResponse recv_query() throws OspException {
        UnionGoodsServiceHelper.query_result result = new UnionGoodsServiceHelper.query_result();
        this.receiveBase(result, UnionGoodsServiceHelper.query_resultHelper.getInstance());
        return result.getSuccess();
    }



    private void send_goodsList(GoodsInfoRequest request) throws OspException {
        this.initInvocation("goodsList");
        UnionGoodsServiceHelper.goodsList_args args = new UnionGoodsServiceHelper.goodsList_args();
        args.setRequest(request);
        this.sendBase(args, UnionGoodsServiceHelper.goodsList_argsHelper.getInstance());
    }

    private GoodsInfoResponse recv_goodsList() throws OspException {
        UnionGoodsServiceHelper.goodsList_result result = new UnionGoodsServiceHelper.goodsList_result();
        this.receiveBase(result, UnionGoodsServiceHelper.goodsList_resultHelper.getInstance());
        return result.getSuccess();
    }


    private void send_genByVIPUrl(List<String> urlList, String chanTag, String requestId, String statParam, UrlGenRequest urlGenRequest) throws OspException {
        this.initInvocation("genByVIPUrl");
        UnionUrlServiceHelper.genByVIPUrl_args args = new UnionUrlServiceHelper.genByVIPUrl_args();
        args.setUrlList(urlList);
        args.setChanTag(chanTag);
        args.setRequestId(requestId);
        args.setStatParam(statParam);
        args.setUrlGenRequest(urlGenRequest);
        this.sendBase(args, UnionUrlServiceHelper.genByVIPUrl_argsHelper.getInstance());
    }

    private UrlGenResponse recv_genByVIPUrl() throws OspException {
        UnionUrlServiceHelper.genByVIPUrl_result result = new UnionUrlServiceHelper.genByVIPUrl_result();
        this.receiveBase(result, UnionUrlServiceHelper.genByVIPUrl_resultHelper.getInstance());
        return result.getSuccess();
    }
}
