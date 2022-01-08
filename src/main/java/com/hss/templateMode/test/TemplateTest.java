package com.hss.templateMode.test;

import com.hss.templateMode.factory.AbstractCageFactory;
import com.hss.templateMode.factory.extend.ElephantPutCageFactory;

/**
 * 模板模式测试
 */
public class TemplateTest {

    public static void main(String[] args) {
        AbstractCageFactory factory = new ElephantPutCageFactory();
        factory.depositary();
    }
}
