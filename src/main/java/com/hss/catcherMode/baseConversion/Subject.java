package com.hss.catcherMode.baseConversion;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	//Subject与Observer的继承对象一对多关系
	private List<Observer> observers = new ArrayList<Observer>();
	//定义标识
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	//更新所有observers中的所有observer
	private void notifyAllObservers() {
		for(Observer observer : observers){
			observer.update();
		}
	}

	
}
