package com.hss.chainOfResponsibilityMode.service.impl;

import com.hss.chainOfResponsibilityMode.service.HandlerService;

/**
 * 初面
 */
public class FirstInterview implements HandlerService {

    private HandlerService handlerService;

    @Override
    public void HandlerReq(Integer times) {
        if(times == 1){
            System.out.println("-------->初面");
        }else {
            handlerService.HandlerReq(times);
        }
    }

    @Override
    public void setNextHandlerService(HandlerService handlerService){
        this.handlerService = handlerService;
    };
}
