package com.hss.strategyMode.impl;

import com.hss.strategyMode.dao.FlyBehavior;

public class GoodFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("--goodFly--");
	}

}
