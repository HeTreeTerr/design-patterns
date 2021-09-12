package com.hss.decoratorMode.bean;

import com.hss.decoratorMode.bean.Drink;

/**
 * 
 * @author lenovo
 * 咖啡的佐料
 *
 */
public class Decorator extends Drink {
	private Drink obj;

	public Decorator(Drink obj) {
		this.obj = obj;
	}

	@Override
	public float cost() {
		
		return super.getPrice()+obj.cost();
	}
	
	public String getDescription(){
		return super.description+"-"+super.getPrice()+"&&"+obj.getDescription();
		
	}

}
