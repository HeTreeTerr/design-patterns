package com.hss.impl;

import com.hss.dao.Factory;
import com.hss.dao.HuMan;

public class WoManFactory implements Factory{

	@Override
	public HuMan creatMan() {
		
		return new WoMan();
	}

}
