package com.atguigu.springcloud.controller;/*
 *jay
 *2021/3/6
 */

import com.atguigu.springcloud.bean.CommonResult;
import com.atguigu.springcloud.bean.Order;
import com.atguigu.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.insert(order);
        return new CommonResult(200,"订单创建成功");
    }

}
