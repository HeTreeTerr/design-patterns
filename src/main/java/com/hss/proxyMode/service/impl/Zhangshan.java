package com.hss.proxyMode.service.impl;


import com.hss.proxyMode.service.Speaker;

/**
 * 张三申辩
 */
public class Zhangshan implements Speaker {

    @Override
    public void speak() {
        System.out.println("张三：我被老婆打了！");
    }
}
