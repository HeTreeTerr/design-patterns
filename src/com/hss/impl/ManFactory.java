package com.hss.impl;

import com.hss.dao.Factory;
import com.hss.dao.HuMan;

public class ManFactory implements Factory{

	@Override
	public HuMan creatMan() {
		
		return new Man();
	}

}
