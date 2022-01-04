package com.hss.proxyMode.dynamicProxy.cglib;

import com.hss.proxyMode.service.impl.Zhangshan;

/**
 * 动态代理演示（cglib）
 * 核心：是继承了被代理对象（无法实现对final方法的代理）
 * 第三方提供，需要引入包
 * 是对jdk动态代理的补充，不需要被代理类实现接口
 */
public class CglibDynamicProxyDemo {

    public static void main(String[] args) {
        Zhangshan zhangshan = new Zhangshan();
        System.out.println("==========》1.张三自己申辩");
        zhangshan.speak();
        System.out.println("==========》1.end 败诉\n");

        System.out.println("==========》2.张三请律师申辩");

        Zhangshan speaker = null;
        try {
            speaker = (Zhangshan)new CglibDynamicProxyLawyer().getInstance(Zhangshan.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        speaker.speak();
        System.out.println("==========》2.end 成功");
    }
}
