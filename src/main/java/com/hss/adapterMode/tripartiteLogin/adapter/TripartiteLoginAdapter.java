package com.hss.adapterMode.tripartiteLogin.adapter;

/**
 * 三方登录 alipayLoginAdapter
 */
public interface TripartiteLoginAdapter {

    /**
     * 微信登录
     * @param param
     * @return
     */
    Boolean weChatLogin(Object param);

    /**
     * 支付宝登录
     * @param param
     * @return
     */
    Boolean alipayLogin(Object param);

    /**
     * 内部登录
     * @param param
     * @return
     */
    Boolean internalLogin(Object param);
}
