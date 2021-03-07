package com.atguigu.springcloud.controller;/*
 *jay
 *2021/3/5
 */

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.util.ExceptionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handlerException")
    public String byResource(){
        return "byResource (*^_^*) ";
    }
    public String handlerException(BlockException exception){
        return "byResource o(╥﹏╥)o----"+exception;
    }

    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public String byUrl(){
        return "byUrl (*^_^*) ";
    }

    @GetMapping("/byUtil")
    @SentinelResource(value = "byUtil",blockHandler = "sentinelException",blockHandlerClass = {ExceptionUtils.class})
    public String byUtil(){
        return "byUtil (*^_^*) ";
    }
}
