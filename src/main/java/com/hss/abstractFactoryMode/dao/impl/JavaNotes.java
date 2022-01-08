package com.hss.abstractFactoryMode.dao.impl;

import com.hss.abstractFactoryMode.dao.Notes;

/**
 * java 课件
 */
public class JavaNotes implements Notes {

    @Override
    public void describe() {
        System.out.println("java 课件");
    }
}
