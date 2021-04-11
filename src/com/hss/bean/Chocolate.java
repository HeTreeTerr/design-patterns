package com.hss.bean;
/**
 * 
 * @author lenovo
 * 巧克力
 *
 */
public class Chocolate extends Decorator{

	public Chocolate(Drink obj) {
		super(obj);
		super.setDescription("chocolate");
		super.setPrice(3.0f);
	}

}
