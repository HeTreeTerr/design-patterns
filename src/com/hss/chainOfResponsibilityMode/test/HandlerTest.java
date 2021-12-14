package com.hss.chainOfResponsibilityMode.test;

import com.hss.chainOfResponsibilityMode.service.HandlerService;
import com.hss.chainOfResponsibilityMode.service.impl.FirstInterview;
import com.hss.chainOfResponsibilityMode.service.impl.SecondInterview;
import com.hss.chainOfResponsibilityMode.service.impl.ThreeInterview;

/**
 * 责任链模式
 */
public class HandlerTest {

    public static void main(String[] args) {
//        1.定义三次面试实例
        HandlerService first = new FirstInterview();
        HandlerService second = new SecondInterview();
        HandlerService three = new ThreeInterview();
//        2.设置链关系
        first.setNextHandlerService(second);
        second.setNextHandlerService(three);
//        3.调用
        for (int i = 1; i <= 3; i++) {
            first.HandlerReq(i);
        }
    }
}
