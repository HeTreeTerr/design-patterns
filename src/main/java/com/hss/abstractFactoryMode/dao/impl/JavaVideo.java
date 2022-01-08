package com.hss.abstractFactoryMode.dao.impl;

import com.hss.abstractFactoryMode.dao.Video;

/**
 * java 视频
 */
public class JavaVideo implements Video {

    @Override
    public void describe() {
        System.out.println("java 视频");
    }
}
