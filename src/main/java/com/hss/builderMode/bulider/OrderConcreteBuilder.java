package com.hss.builderMode.bulider;

import com.hss.builderMode.bean.Order;

/**
 * 订单构造器
 */
public class OrderConcreteBuilder extends OrderBuilder {

    public Order order = new Order();

    @Override
    public void buildId(Long id) {
        order.setId(id);
    }

    @Override
    public void buildOrderNo(String orderNo) {
        order.setOrderNo(orderNo);
    }

    @Override
    public void buildName(String name) {
        order.setName(name);
    }

    @Override
    public Order getResult(){
        return order;
    }
}
