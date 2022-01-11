package com.hss.catcherMode.gameCentre;

import java.util.Observable;

/**
 * 游戏平台（被观察者）
 */
public class GamePlatform extends Observable {

    private final String name = "掌握游戏平台";

    private static GamePlatform platform = null;

    private GamePlatform(){}

    /**
     * 单例获取平台实例
     * @return
     */
    public static GamePlatform getInstance(){
        if(null == platform){
            platform = new GamePlatform();
        }
        return platform;
    }

    /**
     * 公告推送
     * @param bulletin
     */
    public void pushBulletin(Bulletin bulletin){
        System.out.println(bulletin.getName() + "在" + this.name + "上推送一个公告：\n" + bulletin.getContent());
        super.setChanged();
        super.notifyObservers(bulletin);
    }

    public String getName() {
        return name;
    }
}
