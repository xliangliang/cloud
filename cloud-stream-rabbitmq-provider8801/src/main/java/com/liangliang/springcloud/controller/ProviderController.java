package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import com.liangliang.springcloud.service.MyMessageProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by Liangliang on 2020/5/25
 */
@Controller
public class ProviderController {

    @Autowired
    private MyMessageProviderService myMessageProviderService;

    @GetMapping("/rabbitmq/send")
    @ResponseBody
    public CommonResult sendMessage() {
        String msg = myMessageProviderService.send();
        return CommonResult.success(msg);
    }
}
