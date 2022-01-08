package com.hss.builderMode.director;

import com.hss.builderMode.bean.Order;
import com.hss.builderMode.bulider.OrderBuilder;

/**
 * 导演
 */
public class OrderDirector {

    private OrderBuilder orderBuilder;

    public OrderDirector(OrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public Order consuroct1(){
        orderBuilder.buildId(1L);
        orderBuilder.buildOrderNo("test001");
        return orderBuilder.getResult();
    }

    public Order consuroct2(){
        orderBuilder.buildId(1L);
        orderBuilder.buildName("张三");
        return orderBuilder.getResult();
    }

    public Order consuroct3(){
        orderBuilder.buildOrderNo("test001");
        orderBuilder.buildName("张三");
        return orderBuilder.getResult();
    }

    public Order builder(){
        return orderBuilder.getResult();
    }
}
