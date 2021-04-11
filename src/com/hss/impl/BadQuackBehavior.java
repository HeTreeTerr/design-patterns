package com.hss.impl;

import com.hss.dao.QuackBehavior;

public class BadQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("--bad quack for gaga--");
	}

}
