package com.hss.impl;

import com.hss.dao.QuackBehavior;

public class GoodQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("--good quack to gege--");
	}

}
