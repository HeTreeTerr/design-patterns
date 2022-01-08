package com.hss.abstractFactoryMode.impl;

import com.hss.abstractFactoryMode.bean.Man;
import com.hss.abstractFactoryMode.bean.WoMan;
import com.hss.abstractFactoryMode.dao.HuMan;

/**
 * 简单工厂
 */
public class HuManFactory{

    /**
     * 使用反射
     * @param clazz
     * @return
     */
    public HuMan creatMan(Class<? extends HuMan> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 用type来进行区分
     * @param type
     * @return
     */
    public HuMan creatMan(String type) {
        if("man".equals(type)){
            return new Man();
        }else if("woMan".equals(type)){
            return new WoMan();
        }
        return null;
    }

}
