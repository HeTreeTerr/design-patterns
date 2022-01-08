package com.hss.adapterMode.tripartiteLogin.adapter.impl;

import com.hss.adapterMode.tripartiteLogin.adapter.LoginAdapter;

public class WeChatLoginAdapter implements LoginAdapter {

    @Override
    public Boolean support(LoginAdapter adapter) {
        return (adapter instanceof WeChatLoginAdapter);
    }

    @Override
    public Boolean login(Object param) {
        System.out.println("------微信登录-----");
        return true;
    }
}
