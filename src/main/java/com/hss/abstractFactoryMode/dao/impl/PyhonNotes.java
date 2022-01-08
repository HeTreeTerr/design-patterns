package com.hss.abstractFactoryMode.dao.impl;

import com.hss.abstractFactoryMode.dao.Notes;

/**
 * python 课件
 */
public class PyhonNotes implements Notes {

    @Override
    public void describe() {
        System.out.println("python 课件");
    }
}
