package com.hss.catcherMode.impl;

import com.hss.catcherMode.dao.Observer1;

/**
 * 
 * @author lenovo
 *	观察者1：
 */
public class CurrentConditions implements Observer1{

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
		System.out.println("**Today mTemperatrue:"+mTemperatrue+"**");
		System.out.println("**Today mPressure:"+mPressure+"**");
		System.out.println("**Today mHumidity:"+mHumidity+"**");
	}

}
