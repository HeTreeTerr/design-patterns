package com.hss.chainOfResponsibilityMode.service.impl;

import com.hss.chainOfResponsibilityMode.service.HandlerService;

/**
 * 三面
 */
public class ThreeInterview implements HandlerService {

    private HandlerService handlerService;

    @Override
    public void HandlerReq(Integer times) {
        if(times == 3){
            System.out.println("-------->三面");
        }
    }
}
