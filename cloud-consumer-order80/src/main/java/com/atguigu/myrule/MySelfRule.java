package com.atguigu.myrule;/*
 *jay
 *2021/1/30
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //自定义为随机
        return  new RandomRule();
    }
}
