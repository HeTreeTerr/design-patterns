package com.hss.singletonMode.impl;

import java.io.Serializable;

/**
 * 解决序列/反序列破环单例的场景
 */
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton INSTALL = new SeriableSingleton();

    public SeriableSingleton(){

    }

    public static SeriableSingleton getInstall(){
        return INSTALL;
    }

    /**
     * 重新readResolve方法
     * 覆盖反序列化出来的对象
     * 对象还是创建了两次，在jvm层面，相对来说比较安全
     * 之前反序列化出来的对象会被GC回收
     * @return
     */
    private Object readResolve(){
        return INSTALL;
    }
}
