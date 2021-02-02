package com.atguigu.springcloud.myLB;/*
 *jay
 *2021/1/31
 */

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLoadBalancer implements LoadBalancer {

    private  static AtomicInteger atomicInteger =new AtomicInteger(0);

    private final int getAndIncrement(){
        int current;
        int next;

        do{
            current = atomicInteger.get();
            next = current>Integer.MAX_VALUE ? 0: current+1;
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println("第几次访问，次数:"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> list) {
        int index = getAndIncrement() % list.size();
        return list.get(index);
    }
}
