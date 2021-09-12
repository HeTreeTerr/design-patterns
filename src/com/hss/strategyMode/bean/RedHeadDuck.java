package com.hss.strategyMode.bean;
/**
 * 红头鸭
 */
import com.hss.strategyMode.impl.BadFlyBehavior;
import com.hss.strategyMode.impl.BadQuackBehavior;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		flyBehavior = new BadFlyBehavior();
		quackBehavior = new BadQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("**RedHead**");
	}

}
