package com.hss.adapterMode.tripartiteLogin.adapter.impl;

import com.hss.adapterMode.tripartiteLogin.adapter.LoginAdapter;
import com.hss.adapterMode.tripartiteLogin.adapter.TripartiteLoginAdapter;

public class TripartiteLoginImplAdapter implements TripartiteLoginAdapter {

    @Override
    public Boolean weChatLogin(Object param) {
        return this.processLogin(param, WeChatLoginAdapter.class);
    }

    @Override
    public Boolean alipayLogin(Object param) {
        return this.processLogin(param, AlipayLoginAdapter.class);
    }

    @Override
    public Boolean internalLogin(Object param) {
        return this.processLogin(param, InternalLoginAdapter.class);
    }

    private Boolean processLogin(Object param, Class<? extends LoginAdapter> clazz){
        try {
//            反射获取对象
            LoginAdapter loginAdapter = clazz.newInstance();
//            支持
            if(loginAdapter.support(loginAdapter)){
//                执行登录
                return loginAdapter.login(param);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }
}
