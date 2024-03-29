package com.hss.decoratorMode.test;

import com.hss.decoratorMode.bean.Chocolate;
import com.hss.decoratorMode.bean.Decaf;
import com.hss.decoratorMode.bean.Drink;
import com.hss.decoratorMode.bean.Espresso;
import com.hss.decoratorMode.bean.Milk;

/**
 * 
 * @author lenovo
 * 装饰者模式
 * 
 * 扩展性好、改动方便、维护方便
 * 
 * 优点
	   1、装饰者模式可以提供比继承更多的灵活性
	   2、可以通过一种动态的方式来扩展一个对象的功能，在运行时选择不同的装饰器，从而实现不同的行为。
	   3、通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合。可以使用多个具体装饰类来装饰同一对象，得到功能更为强大的对象。
	   4、具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，在使用时再对其进行组合，原有代码无须改变，符合“开闭原则”。
   缺点
	   1、会产生很多的小对象，增加了系统的复杂性
	   2、这种比继承更加灵活机动的特性，也同时意味着装饰模式比继承更加易于出错，排错也很困难，对于多次装饰的对象，调试时寻找错误可能需要逐级排查，较为烦琐。
 */
public class Jewelry {
	public static void main(String[] args) {

		System.out.println("\n=======单点一杯咖啡======");
		//点一杯咖啡
		Drink order1 = new Decaf();

		System.out.println("decaf cost:" + order1.cost());
		System.out.println("decaf Description:" + order1.getDescription());

		System.out.println("\n=======一杯咖啡，加佐料======");
		//点一杯咖啡
		Drink order2 = new Espresso();
		//加一份牛奶
		order2 = new Milk(order2);
		//加一份牛奶
		order2 = new Milk(order2);
		//加一份巧克力
		order2 = new Chocolate(order2);
		System.out.println("cost:"+order2.cost());
		System.out.println("Description:"+order2.getDescription());
		
		
	}
}
