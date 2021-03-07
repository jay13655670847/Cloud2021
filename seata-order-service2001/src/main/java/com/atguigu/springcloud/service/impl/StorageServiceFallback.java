package com.atguigu.springcloud.service.impl;/*
 *jay
 *2021/3/6
 */

import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.stereotype.Component;

@Component
public class StorageServiceFallback implements StorageService {


    @Override
    public CommonResult decrease(Long productId, Integer count) {
        return new CommonResult(4444,"服务降级.....o(╥﹏╥)o");

    }
}
