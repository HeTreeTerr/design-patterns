package com.hss.delegateMode.service.impl;

import com.hss.delegateMode.service.Staff;

/**
 * 员工B
 * 技术
 */
public class StaffBImpl implements Staff {

    @Override
    public void doSomeThing() {
        System.out.println("我是员工B，我去开发！！！");
    }
}
