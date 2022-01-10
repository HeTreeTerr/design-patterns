package com.hss.catcherMode.test;

import com.hss.catcherMode.weather.Observer1;
import com.hss.catcherMode.weather.CurrentConditions;
import com.hss.catcherMode.weather.ForcastConditions;
import com.hss.catcherMode.weather.WeatherDateSt;
/**
 * 
 * @author lenovo
 * 观察者模式
 *
 */
public class WeatherCatcher {
	
	public static void main(String[] args) {

//		主题
		WeatherDateSt weatherDateSt = new WeatherDateSt();

//		观察者
		Observer1 currentConditions = new CurrentConditions();
		Observer1 forcastConditions = new ForcastConditions();

//		订阅（注册或移除）
		weatherDateSt.registerObserver(currentConditions);
		weatherDateSt.registerObserver(forcastConditions);
		
		weatherDateSt.removeObserver(forcastConditions);
//		主题发布消息，订阅者自动得到结果
		weatherDateSt.setData(30, 150, 40);
	}
}
