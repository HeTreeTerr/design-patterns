package com.hss.builderMode.bulider;

import com.hss.builderMode.bean.Order;

public class ChainOrderBuilder {

    private Long id;

    private String orderNo;

    private String name;

    public Long getId() {
        return id;
    }

    public ChainOrderBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public ChainOrderBuilder setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public ChainOrderBuilder setName(String name) {
        this.name = name;
        return this;
    }

    //使用构建者创建Phone对象
    public Order build() {
        return new Order(this);
    }
}
