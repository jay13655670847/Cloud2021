package com.atguigu.springcloud.service;

import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.service.impl.AccountServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seata-account-service",fallback = AccountServiceFallback.class)
public interface AccountService {

    @GetMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
