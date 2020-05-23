package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.common.CommonResult;
import com.liangliang.springcloud.entity.Payment;
import com.liangliang.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * created by Liangliang on 2020/5/22
 */
@Controller
@RequestMapping("payment")
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
}
