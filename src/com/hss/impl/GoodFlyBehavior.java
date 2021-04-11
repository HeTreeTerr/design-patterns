package com.hss.impl;

import com.hss.dao.FlyBehavior;

public class GoodFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("--goodFly--");
	}

}
