package com.hss.singletonMode.impl;

import com.hss.singletonMode.bean.MyObj;

/**
 * 枚举实现单例
 * 1.饿汉式
 * 2.注册式单例
 * 3.线程安全
 * 4.能防止反射和序列化破环单例
 */
public enum EnumSingleton {

    INSTALL;

    private MyObj data;

    EnumSingleton(){
        data = new MyObj();
    }

    public MyObj getData() {
        return data;
    }

    public void setData(MyObj data) {
        this.data = data;
    }

    public static EnumSingleton getInstall(){
        return INSTALL;
    }

}
