package com.hss.strategyMode.impl;

import com.hss.strategyMode.dao.QuackBehavior;

public class BadQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("--bad quack for gaga--");
	}

}
