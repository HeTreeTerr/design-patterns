package com.hss.abstractFactoryMode.dao.impl;

import com.hss.abstractFactoryMode.dao.Video;

/**
 * python视频
 */
public class PythonVideo implements Video {

    @Override
    public void describe() {
        System.out.println("python视频");
    }
}
