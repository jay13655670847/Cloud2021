package com.atguigu.springcloud.service.impl;/*
 *jay
 *2021/3/6
 */

import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.service.AccountService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class AccountServiceFallback implements AccountService {

    @Override
    public CommonResult decrease(Long userId, BigDecimal money) {
        return new CommonResult(444,"服务降级....o(╥﹏╥)o");
    }
}
