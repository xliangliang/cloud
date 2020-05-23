package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * created by Liangliang on 2020/5/23
 */
@Controller
@RequestMapping("/consumer")
public class OrderController {
    public static final String CONSUL_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/consul")
    @ResponseBody
    public CommonResult getPayment() {
        return restTemplate.getForObject(CONSUL_URL + "/payment/consul", CommonResult.class);
    }
}
