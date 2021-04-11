package com.hss.bean;

import com.hss.dao.FlyBehavior;
import com.hss.dao.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		super();
	}

	public void Fly(){
		flyBehavior.fly();
	}
	
	public void Quack(){
		quackBehavior.quack();
	}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void swim(){
		System.out.println("im swim");
	}
	
}
