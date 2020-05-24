package com.liangliang.springcloud.service;

import com.liangliang.springcloud.api.CommonResult;
import com.liangliang.springcloud.service.impl.PaymentFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by Liangliang on 2020/5/24
 */
@Component
@FeignClient(value = "cloud-payment-service", fallback = PaymentFeignServiceImpl.class)
public interface PaymentFeignService {

    @GetMapping("/discovery/getInfo")
    public CommonResult getDiscovery() ;

    @GetMapping("/payment/hystrixTest")
    CommonResult getHystrixTest();
}
