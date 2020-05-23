package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import com.liangliang.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * created by Liangliang on 2020/5/23
 */
@Controller
@RequestMapping("/consumer")
public class OrderController {

    //public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    @ResponseBody
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/addPayment", payment, CommonResult.class);
    }

    @GetMapping("/payment/getPaymentById/{paymentId}")
    @ResponseBody
    public CommonResult getPayment(@PathVariable Long paymentId) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getPaymentById/" + paymentId, CommonResult.class);
    }
}
