package com.hss.catcherMode.test;

import com.hss.catcherMode.gamePad.PadEventCallback;
import com.hss.catcherMode.gamePad.PadEventLisenter;
import com.hss.catcherMode.gamePad.PadEventType;

/**
 * 游戏手柄（观察者）
 */
public class GamePadCatcher {

    public static void main(String[] args) {
//        回调事件（观察者）
        PadEventCallback callback = new PadEventCallback();
//        游戏手柄（被观察者）
        PadEventLisenter lisenter = new PadEventLisenter();
//        为手柄注册事件
        lisenter.addLisenter(PadEventType.UP.getType(),callback);
        lisenter.addLisenter(PadEventType.DOWN.getType(),callback);

        lisenter.up();
        lisenter.down();
    }
}
