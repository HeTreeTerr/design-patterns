package com.hss.adapterMode.tripartiteLogin.service.impl;

import com.hss.adapterMode.tripartiteLogin.service.LoginService;

public class LoginServiceImpl implements LoginService {

    @Override
    public Boolean login(String userName, String password) {
        System.out.println("-------登录-------");
        return true;
    }

    @Override
    public Boolean register(String userName, String password) {
        System.out.println("-------注册-------");
        return true;
    }
}
