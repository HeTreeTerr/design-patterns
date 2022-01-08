package com.hss.builderMode.test;

import com.hss.builderMode.bulider.OrderConcreteBuilder;
import com.hss.builderMode.director.OrderDirector;

/**
 * 建造者测试
 */
public class OrderTest {
    public static void main(String[] args) {

//        构造1
        OrderDirector director1 = new OrderDirector(new OrderConcreteBuilder());
        System.out.println(director1.consuroct1());
//        构造2
        OrderDirector director2 = new OrderDirector(new OrderConcreteBuilder());
        System.out.println(director2.consuroct2());
//        构造3
        OrderDirector director3 = new OrderDirector(new OrderConcreteBuilder());
        System.out.println(director3.consuroct3());
    }
}
