package com.hss.decoratorMode.bean;
/**
 * 
 * @author lenovo
 *	饮品
 */
public abstract class Drink {
	//描述
	public String description = "";
	//价格
	private float price = 0f;
	
	public String getDescription() {
		return description+"-"+this.getPrice();
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//花费费用
	public abstract float cost();
}
