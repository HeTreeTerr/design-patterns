package com.hss.catcherMode.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 观察者
 */
public class GuavaEvent {

    private String name;

    public GuavaEvent(String name){
        this.name = name;
    }

    @Subscribe
    public void subscribe(String str){
        System.out.println("-----------------------");
        System.out.println("Dear " + this.name + ",msg=" + str);
    }
}
