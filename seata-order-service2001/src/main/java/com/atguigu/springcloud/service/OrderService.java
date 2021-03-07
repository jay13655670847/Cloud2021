package com.atguigu.springcloud.service;/*
 *jay
 *2021/3/6
 */

import com.atguigu.springcloud.bean.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderService {

    void insert(Order order);

    void update(Long id, Integer status);
}
