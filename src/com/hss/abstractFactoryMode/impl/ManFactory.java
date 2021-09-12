package com.hss.abstractFactoryMode.impl;

import com.hss.abstractFactoryMode.bean.Man;
import com.hss.abstractFactoryMode.dao.Factory;
import com.hss.abstractFactoryMode.dao.HuMan;

public class ManFactory implements Factory{

	@Override
	public HuMan creatMan() {
		
		return new Man();
	}

}