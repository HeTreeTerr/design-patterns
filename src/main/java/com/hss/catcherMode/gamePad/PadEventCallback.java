package com.hss.catcherMode.gamePad;

/**
 * 手柄事件回调
 */
public class PadEventCallback {

    public void onUp(Event e){
        System.out.println("----------触发手柄上事件---------" + "\n" + e);
    }

    public void onDown(Event e){
        System.out.println("----------触发手柄下事件----------" + "\n" + e);
    }
}
