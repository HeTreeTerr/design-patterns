package com.hss.test;

import com.hss.bean.Subject;
import com.hss.impl.BinaryObserver;
import com.hss.impl.HexaObserver;
import com.hss.impl.OctalObserver;

/**
 * 
 * @author lenovo
 * 观察者模式：
 * 当对象间存在一对多关系时，则使用观察者模式(Observer Parrtern).
 * 比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模型
 * 
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知，而自动更新
 */
public class Catcher {
	public static void main(String[] args) {
		Subject subject = new Subject();
		//16进制
		new HexaObserver(subject);
		//8进制
		new OctalObserver(subject);
		//2进制
		new BinaryObserver(subject);
		
		System.out.println("First stats change:15");
		subject.setState(15);
		
		System.out.println("First stats change:10");
		subject.setState(10);
	}
}
