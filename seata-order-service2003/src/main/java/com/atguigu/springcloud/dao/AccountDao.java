package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.checkerframework.checker.guieffect.qual.UIPackage;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    @Update("update t_account set money=#{money,jdbcType=DECIMAL} where user_id=#{userId}")
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
