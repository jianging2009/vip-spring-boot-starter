package com.holyw.vip.support;

import com.holyw.vip.request.PddDdkGoodsPromotionUrlGenerateRequest;
import com.holyw.vip.request.PddDdkGoodsRecommendGetRequest;
import com.holyw.vip.request.PddDdkGoodsSearchRequest;
import com.holyw.vip.request.PddDdkLotteryUrlGenRequest;
import com.holyw.vip.request.PddDdkMallUrlGenRequest;
import com.holyw.vip.request.PddDdkResourceUrlGenRequest;
import com.holyw.vip.request.PddDdkRpPromUrlGenerateRequest;
import com.holyw.vip.request.PddDdkTopGoodsListQueryRequest;
import com.pdd.pop.sdk.http.api.pop.request.*;
import com.pdd.pop.sdk.http.api.pop.response.*;

public interface VipSupportRepository {

    //pdd.ddk.cms.prom.url.generate生成商城-频道推广链接
    PddDdkCmsPromUrlGenerateResponse pddUdkCmsPromUrlGenerate(PddDdkCmsPromUrlGenerateRequest request) throws Exception;




}
