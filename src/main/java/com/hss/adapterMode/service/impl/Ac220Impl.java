package com.hss.adapterMode.service.impl;

import com.hss.adapterMode.service.Ac220;

public class Ac220Impl implements Ac220 {

    public int outPutAc220() {
        int outPut = 220;
        System.out.println("输出" + outPut + "V");
        return outPut;
    }
}
