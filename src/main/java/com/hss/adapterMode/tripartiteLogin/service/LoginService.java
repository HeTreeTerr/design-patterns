package com.hss.adapterMode.tripartiteLogin.service;

/**
 * 登录服务
 */
public interface LoginService {

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    Boolean login(String userName,String password);

    /**
     * 注册
     * @param userName
     * @param password
     * @return
     */
    Boolean register(String userName,String password);
}
