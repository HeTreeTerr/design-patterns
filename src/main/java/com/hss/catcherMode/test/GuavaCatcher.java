package com.hss.catcherMode.test;

import com.google.common.eventbus.EventBus;
import com.hss.catcherMode.guava.GuavaEvent;

/**
 * 使用guava实现观察者
 */
public class GuavaCatcher {

    public static void main(String[] args) {
//        消息总线（被观察者）
        EventBus bus = new EventBus();

//        定义（观察者）
        GuavaEvent tom = new GuavaEvent("tom");
        GuavaEvent jerry = new GuavaEvent("jerry");

//        注册
        bus.register(tom);
        bus.register(jerry);

        bus.post("Hello world!");
    }
}
