package com.hss.bean;
/**
 * 绿头鸭
 */
import com.hss.impl.GoodFlyBehavior;
import com.hss.impl.GoodQuackBehavior;

public class GreenHeadDuck extends Duck{
	
	public GreenHeadDuck() {
		flyBehavior = new GoodFlyBehavior();
		quackBehavior = new GoodQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("**GreenHead**");
	}

}
