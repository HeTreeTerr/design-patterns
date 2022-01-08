package com.hss.abstractFactoryMode.dao.impl;

import com.hss.abstractFactoryMode.dao.HuMan;

public class Man implements HuMan{

	@Override
	public void distory() {
		System.out.println("男人");
	}

}
