package com.hss.strategyMode.test;

import com.hss.strategyMode.bean.Duck;
import com.hss.strategyMode.bean.GreenHeadDuck;
import com.hss.strategyMode.bean.RedHeadDuck;
import com.hss.strategyMode.impl.GoodFlyBehavior;
import com.hss.strategyMode.impl.GoodQuackBehavior;

/**
 * 
 * @author lenovo
 * 设计模式：
 * 1.设计模式是人们在面对同类型软件工程设计问题所总结出的一些有用经验。模式不是代码，而是某类问题的通用设计方案
 * 
 * 5.设计模式的本质目的使用软件在维护性、扩展性、变化性、复杂度方面成O(N)
 * 6.OO是原则，设计模式是工具
 * 
 * 策略模式注意点：
 * 1.分析项目中变化部分与不变部分
 * 2.多用组合少用继承：用行为类组合，而不是行为的继承。根据弹性
 *
 * 策略模式原理
 * 好处：新增行为简单，行为类更好的复用，组合更方便。既有继承带来的复用好处，又没有挖坑
 * 
 * 策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。
 * 原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立于算法的使用者。
 */
public class ClmsTest {

	public static void main(String[] args) {
		Duck greenHeadDuck = new GreenHeadDuck();
		Duck redHeadDuck = new RedHeadDuck();
		//绿头鸭属性
		greenHeadDuck.display();
		greenHeadDuck.Fly();
		greenHeadDuck.Quack();
		greenHeadDuck.swim();
		//红头鸭属性
		redHeadDuck.display();
		redHeadDuck.Fly();
		redHeadDuck.Quack();
		redHeadDuck.swim();
		//动态改变红头鸭属性
		redHeadDuck.display();
		redHeadDuck.setFlyBehavior(new GoodFlyBehavior());
		redHeadDuck.setQuackBehavior(new GoodQuackBehavior());
		redHeadDuck.Fly();
		redHeadDuck.Quack();
		redHeadDuck.swim();
	}

}
