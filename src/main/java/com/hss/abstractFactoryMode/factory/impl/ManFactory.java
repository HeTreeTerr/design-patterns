package com.hss.abstractFactoryMode.factory.impl;

import com.hss.abstractFactoryMode.dao.impl.Man;
import com.hss.abstractFactoryMode.factory.Factory;
import com.hss.abstractFactoryMode.dao.HuMan;

/**
 * 工厂方法模式
 */
public class ManFactory implements Factory{

	@Override
	public HuMan creatMan() {
		
		return new Man();
	}

}
