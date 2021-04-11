package com.hss.test;

import com.hss.dao.Factory;
import com.hss.dao.HuMan;
import com.hss.impl.Man;
import com.hss.impl.ManFactory;
import com.hss.impl.WoManFactory;

/**
 * 
 * @author lenovo
 * 抽象工厂模式
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 *
 */
public class AbsFacMs {
	
	public static void main(String[] args) {
		Factory fac = new ManFactory();
		HuMan huMan = fac.creatMan();
		huMan.distory();
		
		Factory fac1 = new WoManFactory();
		HuMan huWoMan = fac1.creatMan();
		huWoMan.distory();
	}
}
