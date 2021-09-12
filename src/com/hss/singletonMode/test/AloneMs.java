package com.hss.singletonMode.test;

import com.hss.singletonMode.impl.ChocolateFactory;
import com.hss.singletonMode.impl.Singleton;

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
//		alOneSingleton();

//		多线程下测试懒汉模式（懒汉模式不能保证多线程）
//		concurrentSingleton();

//		巧克力工厂(单线程)，因为实际只new了一个对象，所以只能造一个巧克力
//		alOneChocolateFactory();

//		巧克力工厂(多线程)
		concurrentChocolateFactory();
		
	}

	private static void concurrentChocolateFactory(){
		for (int i = 0; i < 50; i++) {
			new Thread(() ->{
				ChocolateFactory c = ChocolateFactory.getInstance();
				c.fill();
				c.boil();
				c.drain();
			},"t" + i).start();
		}
	}

	private static void alOneChocolateFactory(){
		ChocolateFactory c1 = ChocolateFactory.getInstance();

		ChocolateFactory c2 = ChocolateFactory.getInstance();

		c1.fill();
		c2.fill();

		c1.boil();
		c2.boil();

		c1.drain();
		c2.drain();
	}

	private static void concurrentSingleton(){
		for (int i = 0; i < 50; i++) {
			new Thread(() ->{
				Singleton.getInstance();
			},"t" + 1).start();
		}
	}

	private static void alOneSingleton(){
		Singleton s1 = Singleton.getInstance();

		Singleton s2 = Singleton.getInstance();

		Singleton s3 = Singleton.getInstance();
	}
}
