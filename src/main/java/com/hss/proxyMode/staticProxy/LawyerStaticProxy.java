package com.hss.proxyMode.staticProxy;

import com.hss.proxyMode.service.Speaker;
import com.hss.proxyMode.service.impl.Zhangshan;

/**
 * 律师静态代理
 */
public class LawyerStaticProxy implements Speaker {

    private final Speaker proxy = new Zhangshan();

    @Override
    public void speak() {
        System.out.println("法律不允许！");
        proxy.speak();
        System.out.println("道德不允许！");
    }
}
