package com.hss.catcherMode.test;

import com.hss.catcherMode.gameCentre.Bulletin;
import com.hss.catcherMode.gameCentre.GamePlatform;
import com.hss.catcherMode.gameCentre.Player;

import java.util.Observer;

/**
 * 观察者测试
 * jdk提供的接口，实现游戏公告的发布订阅
 */
public class GamePlatformCatcher {

    public static void main(String[] args) {
//        定义平台
        GamePlatform platform = GamePlatform.getInstance();
//        定义玩家
        Observer tom = new Player("tom");

        Observer jerry = new Player("jerry");
//        玩家订阅平台
        platform.addObserver(tom);
        platform.addObserver(jerry);
//        定义公告
        Bulletin bulletin = new Bulletin();
        bulletin.setName("英雄联盟");
        bulletin.setContent("恭喜你获皮肤优惠资格，登录游戏即享8折优惠！！");
//        推动公告
        platform.pushBulletin(bulletin);
    }
}
