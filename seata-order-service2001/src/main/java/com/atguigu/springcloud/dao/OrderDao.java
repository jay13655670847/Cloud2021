package com.atguigu.springcloud.dao;/*
 *jay
 *2021/3/6
 */

import com.atguigu.springcloud.bean.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrderDao {

    @Insert("insert into t_order values (#{id,jdbcType=BIGINT},#{userId,jdbcType=BIGINT},#{productId,jdbcType=BIGINT},#{count,jdbcType=INTEGER},#{money,jdbcType=DECIMAL},#{status,jdbcType=INTEGER})")
    void insert(Order order);

    @Update("update t_order set status=#{status,jdbcType=INTEGER} where id=#{id}")
    void update(@Param("id") Long id, @Param("status") Integer status);
}
