package com.hss.abstractFactoryMode.factory.impl;

import com.hss.abstractFactoryMode.dao.Notes;
import com.hss.abstractFactoryMode.dao.Video;
import com.hss.abstractFactoryMode.dao.impl.JavaNotes;
import com.hss.abstractFactoryMode.dao.impl.JavaVideo;
import com.hss.abstractFactoryMode.factory.AbsCourseFactory;

/**
 * java 课程工厂
 */
public class JavaCourseFactory implements AbsCourseFactory {

    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Notes createNotes() {
        return new JavaNotes();
    }
}
