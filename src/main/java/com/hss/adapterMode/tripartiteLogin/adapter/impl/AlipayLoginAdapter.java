package com.hss.adapterMode.tripartiteLogin.adapter.impl;

import com.hss.adapterMode.tripartiteLogin.adapter.LoginAdapter;

public class AlipayLoginAdapter implements LoginAdapter {

    @Override
    public Boolean support(LoginAdapter adapter) {
        return (adapter instanceof AlipayLoginAdapter);
    }

    @Override
    public Boolean login(Object param) {
        System.out.println("------支付宝登录-----");
        return true;
    }
}
