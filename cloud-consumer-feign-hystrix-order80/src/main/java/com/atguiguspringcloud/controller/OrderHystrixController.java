package com.atguiguspringcloud.controller;/*
 *jay
 *2021/2/1
 */

import com.atguiguspringcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String paymentInfo_ok = paymentService.paymentInfo_OK(id);
        log.info("*********paymentInfo_ok:"+paymentInfo_ok);
        return paymentInfo_ok;
    }
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String paymentInfo_timeOut = paymentService.paymentInfo_TimeOut(id);
        log.info("*********paymentInfo_timeOut:"+paymentInfo_timeOut);
        return paymentInfo_timeOut;
    }

}
