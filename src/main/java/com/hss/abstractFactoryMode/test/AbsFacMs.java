package com.hss.abstractFactoryMode.test;

import com.hss.abstractFactoryMode.dao.HuMan;
import com.hss.abstractFactoryMode.dao.impl.Man;
import com.hss.abstractFactoryMode.dao.impl.WoMan;
import com.hss.abstractFactoryMode.factory.AbsCourseFactory;
import com.hss.abstractFactoryMode.factory.Factory;
import com.hss.abstractFactoryMode.factory.impl.*;

/**
 * 
 * @author lenovo
 * 抽象工厂模式
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 *
 */
public class AbsFacMs {
	
	public static void main(String[] args) {
//		简单工厂模式
		/*HuManFactory huManFactory = new HuManFactory();
		HuMan huMan = huManFactory.creatMan(Man.class);
		huMan.distory();

		HuMan huWoman = huManFactory.creatMan(WoMan.class);
		huWoman.distory();*/


//		工厂方法模式
		/*Factory fac = new ManFactory();
		HuMan huMan = fac.creatMan();
		huMan.distory();
		
		Factory fac1 = new WoManFactory();
		HuMan huWoMan = fac1.creatMan();
		huWoMan.distory();*/

//		抽象工厂模式
		AbsCourseFactory javaCourseFactory = new JavaCourseFactory();
		javaCourseFactory.createVideo().describe();
		javaCourseFactory.createNotes().describe();

		AbsCourseFactory pythonCourseFactory = new PythonCourseFactory();
		pythonCourseFactory.createVideo().describe();
		pythonCourseFactory.createNotes().describe();
	}
}
