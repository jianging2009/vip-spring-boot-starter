package com.holyw.vip.template;

import com.holyw.vip.support.DuoduokeSupportRepository;
import com.pdd.pop.sdk.http.api.pop.request.PddDdkOrderListIncrementGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOrderListIncrementGetResponse;


public class DuoduokeOrderTemplate {

    private DuoduokeSupportRepository duoduokeSupportRepository;


    public DuoduokeOrderTemplate(DuoduokeSupportRepository duoduokeSupportRepository) {
        this.duoduokeSupportRepository = duoduokeSupportRepository;
    }

    public PddDdkOrderListIncrementGetResponse OrderListIncrementGet(PddDdkOrderListIncrementGetRequest request) throws Exception{
        PddDdkOrderListIncrementGetResponse pddDdkOrderListIncrementGetResponse = duoduokeSupportRepository.pddDdkOrderListIncrementGet(request);
        return pddDdkOrderListIncrementGetResponse;
    }
}
