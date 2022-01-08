# sjms(设计模式学习)
## 1 策略模式
com.hss.strategyMode
策略模式（Strategy Pattern）是指定义了算法家族、分别封 装起来，让它们之间可以互相替换，此模式
让算法的变化不会影响到使用算法的用户。 
可以避免多重分支的if...else...和switch语句  

## 2 观察者模式
com.hss.catcherMode

## 3 工厂模式
com.hss.abstractFactoryMode

### 3.1 简单工厂模式
简单工厂模式（Simple Factory Pattern）是指由一个工厂对象决定创建出哪一种产品类的实例，但它不
属于 GOF，23 种设计模式

### 3.2 工厂方法模式
工厂方法模式（Fatory Method Pattern）是指定义一个创建对象的接口，但让实现这个 接口的类来决定
实例化哪个类，工厂方法让类的实例化推迟到子类中进行。

### 3.3 抽象工厂模式
抽象工厂模式（Abastract Factory Pattern）是指提供一个创建一系列相关或相互依赖对象的接口，无须
指定他们具体的类。
属于创建型设计模式。

## 4 装饰者模式
com.hss.decoratorMode

## 5 单例模式
com.hss.singletonMode  
单例模式（Singleton Pattern）是指确保一个类在任何情况下都绝对只有一个实例，并提供一个全局访问点。 
隐藏其所有的构造方法。
属于创建型模式。  
单例模式分类：
* 饿汉式单例
* 懒汉式单例 
* 注册式单例
* ThreadLocal单例

## 6 建造者模式
com.hss.strategyMode

## 7 责任链模式
com.hss.chainOfResponsibilityMode

## 8 原型模式
com.hss.prototypeMode  
原型模式（Prototype Pattern）是指原型实例指定创建对象的 种类，并且通过拷贝这些原型创建新的对象。 
调用者不需要知道任何创建细节，不调用构造函数。 
属于创建型模式  

## 9 代理模式
com.hss.proxyMode  
代理模式（Proxy Pattern）是指为其它对象提供一种代理，以控制对这个对象的访问。
代理对象在客服端和目标对象之间起到中介作用。
属于结构型设计模式。

代理模式分类：
* 静态代理
* 动态代理  

动态代理模式实现方法：
* jdk动态代理
* cglib

## 10 委派模式
com.hss.delegateMode  
委派模式（Delegate Pattern）的基本作用就是负责任务的调 度和分配任务，跟代理模式很像，可以看做是一种
特殊情况下的静态代理的全权代理，但是代理模式注重过程，而委派模式 注重结果。 
不属于GOF 23种设计模式之一。   
属于行为型模式。  

todo...