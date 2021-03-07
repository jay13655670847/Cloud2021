package com.atguigu.springcloud.service;

import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.service.impl.StorageServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "seata-storage-service",fallback = StorageServiceFallback.class)
public interface StorageService {

    @GetMapping(value = "/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) ;
}
