package com.hss.catcherMode.weather;

import com.hss.catcherMode.weather.Observer1;

/**
 * 
 * @author lenovo
 * 观察者2
 *
 */
public class ForcastConditions implements Observer1{
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	
	@Override
	public void update(float mTemperatrue, float mPressure, float mHumidity) {
		this.mTemperatrue = mTemperatrue;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;
		display();
	}
	
	//显示
	public void display(){
		System.out.println("**Tomorrow mTemperatrue:"+mTemperatrue+"**");
		System.out.println("**Tomorrow mPressure:"+mPressure+"**");
		System.out.println("**Tomorrow mHumidity:"+mHumidity+"**");
	}
}
