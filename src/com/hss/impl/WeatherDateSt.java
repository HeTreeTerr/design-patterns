package com.hss.impl;

import java.util.ArrayList;

import com.hss.dao.Observer1;
import com.hss.dao.Subject1;

public class WeatherDateSt implements Subject1{
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private ArrayList<Observer1> mObservers;
	
	public WeatherDateSt() {
		mObservers = new ArrayList<Observer1>();
	}
	
	
	public float getmTemperatrue() {
		return mTemperatrue;
	}


	public float getmPressure() {
		return mPressure;
	}


	public float getmHumidity() {
		return mHumidity;
	}

	
	public void dateChange(){
		notifyObserver();
	}
	
	public void setData(float mTemperatrue, float mPressure, float mHumidity){
		this.mTemperatrue = mTemperatrue;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;
		dateChange();
	}

	@Override
	public void registerObserver(Observer1 observer1) {
		mObservers.add(observer1);
	}

	@Override
	public void removeObserver(Observer1 observer1) {
		if(mObservers.contains(observer1)){
			mObservers.remove(observer1);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i = 0,len = mObservers.size();i <len;i++){
			mObservers.get(i).update(mTemperatrue, mPressure, mHumidity);
		}
	}

}
