package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * created by Liangliang on 2020/5/23
 */
@Controller
@RequestMapping("/discovery")
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getInfo")
    @ResponseBody
    public CommonResult getDiscovery() {

        System.out.println("start");
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("service:" + service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance : instances) {
            System.out.println("instanceId:" + instance.getInstanceId());
            System.out.println("serviceId:" + instance.getServiceId());
            System.out.println("host:" + instance.getHost());
            System.out.println("port:" + instance.getPort());
            System.out.println("uri:" + instance.getUri());
        }

        return CommonResult.success(this.discoveryClient);

    }
}
