package com.liangliang.springcloud.service.impl;

import com.liangliang.springcloud.api.CommonResult;
import com.liangliang.springcloud.service.PaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * created by Liangliang on 2020/5/24
 */
@Component
public class PaymentFeignServiceImpl implements PaymentFeignService {
    @Override
    public CommonResult getDiscovery() {
        return null;
    }

    @Override
    public CommonResult getHystrixTest() {
        return CommonResult.failed("服务走丢了");
    }
}
