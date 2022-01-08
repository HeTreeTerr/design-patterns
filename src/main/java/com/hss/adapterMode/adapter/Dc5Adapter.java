package com.hss.adapterMode.adapter;

import com.hss.adapterMode.service.Dc5;
import com.hss.adapterMode.service.impl.Ac220Impl;

public class Dc5Adapter extends Ac220Impl implements Dc5 {

    public int outPutDc5() {
        int outPutAc220 = super.outPutAc220();
        System.out.println("----->变压");
        int outPut = outPutAc220 / 44;
        System.out.println("输出" + outPut + "V");
        return outPut;
    }
}
