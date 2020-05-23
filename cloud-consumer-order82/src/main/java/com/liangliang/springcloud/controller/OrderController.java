package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * created by Liangliang on 2020/5/24
 */
@Controller
@RequestMapping("/consumer")
public class OrderController {
    public static final String ZOO_URL = "http://cloud-provider-paymen";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/zk")
    @ResponseBody
    public CommonResult getPayment() {
        return restTemplate.getForObject(ZOO_URL + "/payment/zk", CommonResult.class);
    }
}
