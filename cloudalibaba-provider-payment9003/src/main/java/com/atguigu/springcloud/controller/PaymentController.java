package com.atguigu.springcloud.controller;/*
 *jay
 *2021/3/5
 */

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    public static HashMap<Long, Payment> hashMap= new HashMap<Long,Payment>();

    static {
        hashMap.put(1L,new Payment(1L,"55423642336542361"));
        hashMap.put(2L,new Payment(2L,"55423642336555662"));
        hashMap.put(3L,new Payment(3L,"55423eeee65423663"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result =new CommonResult<Payment>(200,"from mysql,serverPort:  "+port,payment);
        return result;
    }
}
