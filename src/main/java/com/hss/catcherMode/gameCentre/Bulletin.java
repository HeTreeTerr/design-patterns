package com.hss.catcherMode.gameCentre;

/**
 * 公告
 */
public class Bulletin {

    private String name;

    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Bulletin{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
