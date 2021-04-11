package com.hss.dao;

import com.hss.bean.Pizza;
/**
 * 
 * @author lenovo
 * 抽象工厂接口
 *
 */
public interface AbsFactory {
	
	public Pizza CreatePizza(String ordertype);
}
