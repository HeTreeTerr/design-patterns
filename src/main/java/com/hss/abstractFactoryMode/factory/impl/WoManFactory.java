package com.hss.abstractFactoryMode.factory.impl;

import com.hss.abstractFactoryMode.dao.impl.WoMan;
import com.hss.abstractFactoryMode.dao.HuMan;
import com.hss.abstractFactoryMode.factory.Factory;

/**
 * 工厂方法模式
 */
public class WoManFactory implements Factory {

	@Override
	public HuMan creatMan() {
		
		return new WoMan();
	}

}
