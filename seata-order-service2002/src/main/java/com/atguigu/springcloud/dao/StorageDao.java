package com.atguigu.springcloud.dao;/*
 *jay
 *2021/3/6
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
public interface StorageDao {

    //扣减库存信息
    @Update("update t_storage set count=#{count,jdbcType=INTEGER} where product_id=#{productId}" )
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
