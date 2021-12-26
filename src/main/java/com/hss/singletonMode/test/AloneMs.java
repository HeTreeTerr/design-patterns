package com.hss.singletonMode.test;

import com.hss.singletonMode.impl.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author lenovo
 * 单例模式
 * 有些对象我们只需要一个：线程池、缓存、硬件设备等
 * 如果多个实例会有造成冲突、结果不一致性等问题
 * 
 * 单例模式：确保一个类最多只有一个实例，并提供一个全局访问点
 * 
 * 饿汉式单例
 * 懒汉式单例
 *
 */
public class AloneMs {
	
	public static void main(String[] args) {
//		饿汉模式，在启动时就创建实例，暂无测试代码

//		经典懒汉单例模式代码实例
//		alOneSingleton();

//		多线程下测试懒汉模式（懒汉模式不能保证多线程）
//		concurrentSingleton();

//		巧克力工厂(单线程)，因为实际只new了一个对象，所以只能造一个巧克力
//		alOneChocolateFactory();

//		巧克力工厂(多线程)
//		concurrentChocolateFactory();

//		内部类实现单例模式(多线程)
//		concurrentLazyInnerClassSingleton();

//		解决反射构造实例，破环单例
//		reflexSingleton();

//		解决序列化构造实例，破环单例
//		seriableSingleton();

//		枚举单例
		enumSingleton();
	}

	private static void enumSingleton(){
		for (int i = 0; i < 50; i++) {
			new Thread(() ->{
				System.out.println(EnumSingleton.getInstall().getData());
			},"t" + i).start();
		}
	}

	private static void seriableSingleton(){
		SeriableSingleton s1 = null;
		SeriableSingleton s2 = SeriableSingleton.getInstall();

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("SeriableSingleton.obj");
			ObjectOutputStream outputStream = new ObjectOutputStream(fos);
			outputStream.writeObject(s2);
			outputStream.flush();
			outputStream.close();

			FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
			ObjectInputStream inputStream = new ObjectInputStream(fis);
			s1 = (SeriableSingleton)inputStream.readObject();
			inputStream.close();

			System.out.println(s1 == s2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void reflexSingleton(){
		try {
			Class<LazyInnerClassSingleton> aClass = LazyInnerClassSingleton.class;
			Constructor<LazyInnerClassSingleton> constructor = aClass.getDeclaredConstructor(null);
			constructor.setAccessible(true);

			LazyInnerClassSingleton o1 = constructor.newInstance();
			LazyInnerClassSingleton o2 = LazyInnerClassSingleton.getInstance();

			System.out.println(o1 == o2);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	private static void concurrentLazyInnerClassSingleton(){
		for (int i = 0; i < 50; i++) {
			new Thread(() ->{
				System.out.println(LazyInnerClassSingleton.getInstance());
			},"t" + i).start();
		}
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
