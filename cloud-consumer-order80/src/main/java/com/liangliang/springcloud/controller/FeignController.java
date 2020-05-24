package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import com.liangliang.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by Liangliang on 2020/5/24
 */
@Controller
@RequestMapping("/consumer")
public class FeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/openfeign")
    @ResponseBody
    public CommonResult getDiscovery(){
        return paymentFeignService.getDiscovery();
    }

    @GetMapping("/fallback")
    @ResponseBody
    public CommonResult getHystrixTest(){
        return paymentFeignService.getHystrixTest();
    }
}
