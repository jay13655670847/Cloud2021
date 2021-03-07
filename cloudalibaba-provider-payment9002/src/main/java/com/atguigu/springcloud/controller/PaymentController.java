package com.atguigu.springcloud.controller;/*
 *jay
 *2021/2/16
 */


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") String id){
        return "nacos register,serverport:"+serverPort+"\t id:"+id;
    }
}
