package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by Liangliang on 2020/5/24
 */
@Controller
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/consul")
    @ResponseBody
    public CommonResult payment() {
        String str = "springcloud consul";
        return CommonResult.success(str);
    }
}
