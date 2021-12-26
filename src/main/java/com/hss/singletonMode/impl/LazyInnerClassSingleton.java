package com.hss.singletonMode.impl;

/**
 * 使用内部类实现
 * 懒汉单例模式
 */
public class LazyInnerClassSingleton {

    /*
    虽然构造方法有了，但是还是对反射无效
     */
    private LazyInnerClassSingleton(){
//        防止反射多次构建实例，直接抛出异常
        if(LazyInnerClass.instance != null){
            throw new RuntimeException("不允许多次构建！");
        }
        System.out.println("LazyInnerClassSingleton is init");
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazyInnerClass.instance;
    }

    private static class LazyInnerClass{

        private static LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
}
