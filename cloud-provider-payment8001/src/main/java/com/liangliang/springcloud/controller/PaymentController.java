package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import com.liangliang.springcloud.entity.Payment;
import com.liangliang.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * created by Liangliang on 2020/5/22
 */
@Controller
@RequestMapping("/payment")
@DefaultProperties(defaultFallback = "hystrixTestHandler")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addPayment(@RequestBody Payment payment) {
        return CommonResult.success(paymentService.create(payment));
    }

    @RequestMapping(value = "/getPaymentById/{paymentId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getPaymentById(@PathVariable Long paymentId) {
        Payment payment = paymentService.getPaymentById(paymentId);
        return CommonResult.success(payment);
    }

    /*@HystrixCommand(fallbackMethod = "hystrixTestHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })*/
    //@HystrixCommand
    @HystrixCommand(fallbackMethod = "hystrixTestHandler", commandProperties = {
            // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            // 请求次数
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            // 失败率达到多少后不能正常工作
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    @GetMapping("/hystrixTest")
    @ResponseBody
    public CommonResult hystrixTest() {
        for (int i = 0; i < 50000; i++){
            if (i == 3) {
                throw new RuntimeException("i等于3报错");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
        return CommonResult.success("hystrixTest111");
    }

    public CommonResult hystrixTestHandler() {
        return CommonResult.failed("网络繁忙，请稍后再试");
    }
}
