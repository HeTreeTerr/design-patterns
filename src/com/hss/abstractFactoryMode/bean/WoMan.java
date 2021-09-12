package com.hss.abstractFactoryMode.bean;

import com.hss.abstractFactoryMode.dao.HuMan;

public class WoMan implements HuMan{

	@Override
	public void distory() {
		System.out.println("女人");
	}

}
