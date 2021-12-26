package com.hss.builderModer.director;

import com.hss.builderModer.bean.Order;
import com.hss.builderModer.bulider.OrderBuilder;

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
