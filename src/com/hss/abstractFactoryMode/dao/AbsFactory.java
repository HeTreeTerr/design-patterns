package com.hss.abstractFactoryMode.dao;

import com.hss.abstractFactoryMode.bean.Pizza;
/**
 * 
 * @author lenovo
 * 抽象工厂接口
 *
 */
public interface AbsFactory {
	
	public Pizza CreatePizza(String ordertype);
}
