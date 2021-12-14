package com.hss.chainOfResponsibilityMode.service;

public interface HandlerService {
    /**
     * 处理请求
     */
    void HandlerReq(Integer times);

    default void setNextHandlerService(HandlerService handlerService){

    };
}
