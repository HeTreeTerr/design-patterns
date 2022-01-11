package com.hss.catcherMode.gameCentre;

import java.util.Observable;
import java.util.Observer;

/**
 * 玩家（观察者）
 */
public class Player implements Observer {

    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("----------------------");
        GamePlatform platform = (GamePlatform)o;
        Bulletin bulletin = (Bulletin)arg;
        System.out.println("亲爱的玩家【" + this.name + "】您好，\n"
        + bulletin.getName() + "在" + platform.getName() + "推送新公告。内容如下：\n"
        + bulletin.getContent());
    }
}
