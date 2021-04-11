package com.hss.impl;

import com.hss.dao.FlyBehavior;

public class BadFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("--badFly--");
	}

}
