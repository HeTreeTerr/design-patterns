package com.hss.test;

import com.hss.impl.ChocolateFactory;
import com.hss.impl.Singleton;

import sun.nio.cs.SingleByte;

/**
 * 
 * @author lenovo
 * 单例模式
 * 有些对象我们只需要一个：线程池、缓存、硬件设备等
 * 如果多个实例会有造成冲突、结果不一致性等问题
 * 
 * 单例模式：确保一个类最多只有一个实例，并提供一个全局访问点
 * 
 * 经典单例模式代码实例
 *
 */
public class AloneMs {
	
	public static void main(String[] args) {
//		经典单例模式代码实例
	/*	Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		Singleton s3 = Singleton.getInstance();*/
//		巧克力工厂
		ChocolateFactory c1 = ChocolateFactory.getInstance();
		
		ChocolateFactory c2 = ChocolateFactory.getInstance();
		
		c1.fill();
		c2.fill();
		
		c1.boil();
		c2.boil();
		
		c1.drain();
		c2.drain();
		
//		优化,多线程环境下（时间片问题）,无法保证唯一性
//		同步锁(synchronized) getInstance方法
		
//		"急切"创建实例
		
//		双重检查加锁
		
		
		
	}
}
