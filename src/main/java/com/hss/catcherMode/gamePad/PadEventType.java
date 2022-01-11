package com.hss.catcherMode.gamePad;

/**
 * 手柄事件类型
 */
public enum PadEventType {

    UP("up","上"),
    DOWN("down","下"),
//    LEFT("left","左"),
//    RIGHT("right","右"),
//    ATTACK("attack","攻击"),
//    DEFENSE("defense","防御")
    ;

    private String type;

    private String msg;

    PadEventType(String type,String msg){
        this.type = type;
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
