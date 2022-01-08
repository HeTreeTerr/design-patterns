package com.hss.adapterMode.tripartiteLogin.test;

import com.hss.adapterMode.tripartiteLogin.adapter.TripartiteLoginAdapter;
import com.hss.adapterMode.tripartiteLogin.adapter.impl.TripartiteLoginImplAdapter;
import com.hss.adapterMode.tripartiteLogin.service.LoginService;
import com.hss.adapterMode.tripartiteLogin.service.impl.LoginServiceImpl;

/**
 * 适配器，测试类
 */
public class LoginTest {

    public static void main(String[] args) {
        System.out.println("\n========原有登录逻辑=======");
        LoginService loginService = new LoginServiceImpl();
        System.out.println("登录结果：" + loginService.login("admin","admin"));

        System.out.println("\n========适配扩展登录=======");
        TripartiteLoginAdapter loginAdapter = new TripartiteLoginImplAdapter();
//        内部
        System.out.println("内部登录结果：" + loginAdapter.internalLogin(new Object()));
//        微信
        System.out.println("微信登录结果：" + loginAdapter.weChatLogin(new Object()));
//        支付宝
        System.out.println("支付宝登录结果：" + loginAdapter.alipayLogin(new Object()));
    }
}
