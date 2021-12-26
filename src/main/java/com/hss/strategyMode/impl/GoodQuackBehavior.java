package com.hss.strategyMode.impl;

import com.hss.strategyMode.dao.QuackBehavior;

public class GoodQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("--good quack to gege--");
	}

}
