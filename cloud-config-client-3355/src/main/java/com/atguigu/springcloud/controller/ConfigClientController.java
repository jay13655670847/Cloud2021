package com.atguigu.springcloud.controller;/*
 *jay
 *2021/2/6
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return info;
    }

}
