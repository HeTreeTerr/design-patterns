package com.hss.decoratorMode.bean;

/**
 * 
 * @author lenovo
 * 加一份巧克力的饮品
 *
 */
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		super.setDescription("chocolate");
		super.setPrice(3.0f);
	}

}
