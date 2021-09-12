package com.hss.strategyMode.impl;

import com.hss.strategyMode.dao.FlyBehavior;

public class BadFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("--badFly--");
	}

}
