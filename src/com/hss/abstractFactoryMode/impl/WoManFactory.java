package com.hss.abstractFactoryMode.impl;

import com.hss.abstractFactoryMode.bean.WoMan;
import com.hss.abstractFactoryMode.dao.Factory;
import com.hss.abstractFactoryMode.dao.HuMan;

public class WoManFactory implements Factory{

	@Override
	public HuMan creatMan() {
		
		return new WoMan();
	}

}
