package com.hss.chainOfResponsibilityMode.service.impl;

import com.hss.chainOfResponsibilityMode.service.HandlerService;

/**
 * 二面
 */
public class SecondInterview implements HandlerService {

    private HandlerService handlerService;

    @Override
    public void HandlerReq(Integer times) {
        if(times == 2){
            System.out.println("-------->二面");
        }else {
            handlerService.HandlerReq(times);
        }
    }

    @Override
    public void setNextHandlerService(HandlerService handlerService){
        this.handlerService = handlerService;
    };
}
