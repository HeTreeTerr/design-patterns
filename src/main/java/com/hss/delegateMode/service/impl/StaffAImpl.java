package com.hss.delegateMode.service.impl;

import com.hss.delegateMode.service.Staff;

/**
 * 员工A
 * 商务
 */
public class StaffAImpl implements Staff {

    @Override
    public void doSomeThing() {
        System.out.println("我是员工A，我去谈商！！！");
    }
}
