package com.hss.builderMode.bean;

import com.hss.builderMode.bulider.ChainOrderBuilder;

/**
 * 订单
 */
public class Order {

    private Long id;

    private String orderNo;

    private String name;

    public Order() {
    }

    public Order(ChainOrderBuilder builder) {
        this.id = builder.getId();
        this.orderNo = builder.getOrderNo();
        this.name = builder.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
