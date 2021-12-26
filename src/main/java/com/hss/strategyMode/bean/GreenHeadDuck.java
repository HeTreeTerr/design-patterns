package com.hss.strategyMode.bean;
/**
 * 绿头鸭
 */
import com.hss.strategyMode.impl.GoodFlyBehavior;
import com.hss.strategyMode.impl.GoodQuackBehavior;

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
