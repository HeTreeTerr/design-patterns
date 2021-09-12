package com.hss.catcherMode.dao;

public interface Subject1 {
	//注册观察者
	public void registerObserver(Observer1 observer1);
	//移除观察者
	public void removeObserver(Observer1 observer1);
	//通知观察者
	public void notifyObserver();
}
