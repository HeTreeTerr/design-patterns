package com.hss.adapterMode.tripartiteLogin.adapter.impl;

import com.hss.adapterMode.tripartiteLogin.adapter.LoginAdapter;
import com.hss.adapterMode.tripartiteLogin.service.impl.LoginServiceImpl;

public class InternalLoginAdapter extends LoginServiceImpl implements LoginAdapter {

    @Override
    public Boolean support(LoginAdapter adapter) {
        return (adapter instanceof  InternalLoginAdapter);
    }

    @Override
    public Boolean login(Object param) {
        System.out.println("------内部登录-----");
        return super.login(String.valueOf(param),null);
    }
}
