package com.example.demo.config;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.advisor.api.*;
import org.springframework.ai.chat.model.MessageAggregator;
import reactor.core.publisher.Flux;

@Slf4j
public class SimpleLoggerAdvisor implements CallAroundAdvisor, StreamAroundAdvisor {
    @Override
    public AdvisedResponse aroundCall(AdvisedRequest advisedRequest, CallAroundAdvisorChain chain) {
        log.info("请求参数: {}", JSON.toJSONString(advisedRequest));
        AdvisedResponse advisedResponse = chain.nextAroundCall(advisedRequest);

        log.info("结果参数: {}", advisedResponse);

        return advisedResponse;
    }

    @Override
    public Flux<AdvisedResponse> aroundStream(AdvisedRequest advisedRequest, StreamAroundAdvisorChain chain) {
        log.info("请求参数: {}", advisedRequest);

        Flux<AdvisedResponse> advisedResponses = chain.nextAroundStream(advisedRequest);

        return new MessageAggregator().aggregateAdvisedResponse(advisedResponses,
                advisedResponse -> log.info("结果参数: {}", advisedResponse));
    }

    @Override
    public String getName() {
        return "测试";
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
