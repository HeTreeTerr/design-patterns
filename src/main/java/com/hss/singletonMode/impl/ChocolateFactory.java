package com.hss.singletonMode.impl;
/**
 * 
 * @author lenovo
 * 巧克力工厂
 *
 * 优化,多线程环境下（时间片问题）,无法保证唯一性
 * 同步锁(synchronized) getInstance方法
 *
 * "急切"创建实例
 * 双重检查加锁
 *
 */
public class ChocolateFactory {
//	空
	private volatile boolean empty;
//	煮沸
	private volatile boolean boiled;

//	使用volatile修饰单例对象，防止高并发下，因为指令重排引发问题(地址不为空，地址上没有对象，导致问题)
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
					System.out.println(Thread.currentThread().getName() + "\t Object is init...");
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
