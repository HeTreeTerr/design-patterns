package com.hss.adapterMode.transformer.test;

import com.hss.adapterMode.transformer.adapter.Dc5Adapter;
import com.hss.adapterMode.transformer.service.Ac220;
import com.hss.adapterMode.transformer.service.Dc5;
import com.hss.adapterMode.transformer.service.impl.Ac220Impl;

/**
 * 适配器测试类
 */
public class AdapterTest {

    public static void main(String[] args) {
        System.out.println("========Ac200输出规则=======");
//        Ac200输出规则
        Ac220 ac220 = new Ac220Impl();
        ac220.outPutAc220();

        System.out.println("========Dc5输出规则（适配器）=======");
//        Dc5输出规则（适配器）
        Dc5 dc5 = new Dc5Adapter();
        dc5.outPutDc5();
    }
}
