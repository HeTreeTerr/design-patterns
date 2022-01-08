package com.hss.adapterMode.tripartiteLogin.adapter;

/**
 * 登录适配器
 */
public interface LoginAdapter {

    /**
     * 支持
     * @return
     */
    Boolean support(LoginAdapter adapter);

    /**
     * 登录
     * @param param
     * @return
     */
    Boolean login(Object param);
}
