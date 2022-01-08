package com.hss.abstractFactoryMode.dao.impl;

import com.hss.abstractFactoryMode.dao.HuMan;

public class WoMan implements HuMan{

	@Override
	public void distory() {
		System.out.println("女人");
	}

}
