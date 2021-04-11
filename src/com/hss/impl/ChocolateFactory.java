package com.hss.impl;
/**
 * 
 * @author lenovo
 * 巧克力工厂
 *
 */
public class ChocolateFactory {
	//空
	private boolean empty;
	//煮沸
	private boolean boiled;
	
	private volatile static ChocolateFactory uniqeInstance = null;
	
	private ChocolateFactory() {
		empty = true;
		boiled = false;
	}
	
	//同步锁
	public static ChocolateFactory getInstance(){
//		双重检查加锁
		if(uniqeInstance == null){
			synchronized (ChocolateFactory.class) {
				if(uniqeInstance == null){
					uniqeInstance = new ChocolateFactory();
				}
			}				
		}
		return uniqeInstance;
	}
	
	public void fill(){
		//true
		if(empty){
			System.out.println("添加巧克力原料---");
			//添加原料巧克力动作
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		//false         true
		if((!empty) && boiled){
			System.out.println("排出巧克力------");
			//排出巧克力动作
			empty = true;
		}
	}
	
	public void boil(){
		//false         false
		if((!empty) && (!boiled)){
			System.out.println("煮沸原料-----");
			//煮沸
			boiled = true;
		}
	}
}
