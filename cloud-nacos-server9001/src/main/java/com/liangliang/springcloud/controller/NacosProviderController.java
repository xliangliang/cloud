package com.liangliang.springcloud.controller;

import com.liangliang.springcloud.api.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by Liangliang on 2020/5/25
 */
@Controller
public class NacosProviderController {

    @GetMapping("/nacos/info")
    @ResponseBody
    public CommonResult getInfo() {
        String info = "NacosProvider9001";
        return CommonResult.success(info);
    }
}
