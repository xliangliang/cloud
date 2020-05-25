package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


/**
 * created by Liangliang on 2020/5/25
 */
@Controller
public class NacosConsumerController {

    @Value("${service-url.nacos-service}")
    private String serviceUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/nacos/info")
    @ResponseBody
    public CommonResult getInfo() {
        return restTemplate.getForObject(serviceUrl + "/nacos/info", CommonResult.class);
    }
}
