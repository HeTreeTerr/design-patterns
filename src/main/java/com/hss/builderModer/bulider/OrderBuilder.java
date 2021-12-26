package com.hss.builderModer.bulider;

import com.hss.builderModer.bean.Order;

/**
 * 订单构造器
 */
public abstract class OrderBuilder {

    public abstract void buildId(Long id);

    public abstract void buildOrderNo(String orderNo);

    public abstract void buildName(String name);

    public abstract Order getResult();
}
