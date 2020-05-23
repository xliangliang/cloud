package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import com.liangliang.springcloud.dto.ResultDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by Liangliang on 2020/5/23
 */
@Controller
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/zk")
    @ResponseBody
    public CommonResult paymentZk() {
        ResultDto resultDto = new ResultDto();
        resultDto.setUrl("springcloud zookeeper");
        return CommonResult.success(resultDto);
    }
}
