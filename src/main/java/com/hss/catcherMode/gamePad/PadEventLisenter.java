package com.hss.catcherMode.gamePad;

public class PadEventLisenter extends EventLisenter {

    public void up(){
        System.out.println("调用上移方法");
        this.trigger(PadEventType.UP.getType());
    }

    public void down(){
        System.out.println("调用下移方法");
        this.trigger(PadEventType.DOWN.getType());
    }
}
