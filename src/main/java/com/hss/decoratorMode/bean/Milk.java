package com.hss.decoratorMode.bean;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}
