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
@RequestMapping("/discovery")
public class DiscoveryController {

    @GetMapping("/getInfo")
    @ResponseBody
    public CommonResult getDiscovery() {
        return CommonResult.success("8002");
    }
}
