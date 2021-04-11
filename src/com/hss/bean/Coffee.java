package com.hss.bean;
/**
 * 
 * @author lenovo
 * 咖啡，继承饮品属性
 */
public class Coffee extends Drink{

	@Override
	public float cost() {
		return this.getPrice();
	}

}
