package com.hss.decoratorMode.bean;

/**
 * 加了牛奶的饮品
 */
public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}
