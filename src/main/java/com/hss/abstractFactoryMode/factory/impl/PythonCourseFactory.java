package com.hss.abstractFactoryMode.factory.impl;

import com.hss.abstractFactoryMode.dao.Notes;
import com.hss.abstractFactoryMode.dao.Video;
import com.hss.abstractFactoryMode.dao.impl.PyhonNotes;
import com.hss.abstractFactoryMode.dao.impl.PythonVideo;
import com.hss.abstractFactoryMode.factory.AbsCourseFactory;

/**
 * python 课程工厂
 */
public class PythonCourseFactory implements AbsCourseFactory {

    @Override
    public Video createVideo() {
        return new PythonVideo();
    }

    @Override
    public Notes createNotes() {
        return new PyhonNotes();
    }
}
