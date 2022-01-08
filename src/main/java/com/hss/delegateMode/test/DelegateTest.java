package com.hss.delegateMode.test;

import com.hss.delegateMode.service.Boss;
import com.hss.delegateMode.service.impl.BossImpl;
import com.hss.delegateMode.service.impl.LoaderImpl;

/**
 * 委派模式测试
 */
public class DelegateTest {

    public static void main(String[] args) {
//        1.定义领导
        Boss boss = new BossImpl();
//        2.领导发布命令
        boss.command("business",new LoaderImpl());
    }
}
