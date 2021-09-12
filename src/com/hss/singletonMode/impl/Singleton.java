package com.hss.singletonMode.impl;

/**
 * 经典懒汉模式
 */
public class Singleton {

	private static Singleton uniqeInstance = null;
	
	private Singleton(){
		System.out.println("new singleton");
	}
	
	public static Singleton getInstance(){
		if(uniqeInstance == null){
			uniqeInstance = new Singleton();
		}
		return uniqeInstance;
	}
}
