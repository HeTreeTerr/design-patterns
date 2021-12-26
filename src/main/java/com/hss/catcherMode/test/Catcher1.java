package com.hss.catcherMode.test;

import com.hss.catcherMode.impl.CurrentConditions;
import com.hss.catcherMode.impl.ForcastConditions;
import com.hss.catcherMode.impl.WeatherDateSt;
/**
 * 
 * @author lenovo
 * 观察者模式
 *
 */
public class Catcher1 {
	
	public static void main(String[] args) {
		CurrentConditions currentConditions;
		ForcastConditions forcastConditions;
		
		WeatherDateSt weatherDateSt;
		weatherDateSt = new WeatherDateSt();
		
		currentConditions = new CurrentConditions();
		forcastConditions = new ForcastConditions();
		
		weatherDateSt.registerObserver(currentConditions);
		weatherDateSt.registerObserver(forcastConditions);
		
		weatherDateSt.removeObserver(forcastConditions);
		weatherDateSt.setData(30, 150, 40);
	}
}
