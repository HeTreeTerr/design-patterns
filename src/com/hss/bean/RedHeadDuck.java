package com.hss.bean;
/**
 * 红头鸭
 */
import com.hss.impl.BadFlyBehavior;
import com.hss.impl.BadQuackBehavior;

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
