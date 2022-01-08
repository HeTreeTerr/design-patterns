package com.hss.abstractFactoryMode.factory;

import com.hss.abstractFactoryMode.dao.Notes;
import com.hss.abstractFactoryMode.dao.Video;

/**
 * 课程
 * 抽象工厂接口
 */
public interface AbsCourseFactory {

	/**
	 * 视频
	 */
	Video createVideo();

	/**
	 * 课件
	 */
	Notes createNotes();
}
