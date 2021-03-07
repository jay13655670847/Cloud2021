package com.atguigu.springcloud.util;/*
 *jay
 *2021/3/5
 */

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class ExceptionUtils {

    public static String sentinelException(BlockException exception){
        return "sentinelException /(ㄒoㄒ)/~~"+exception;
    }
}
