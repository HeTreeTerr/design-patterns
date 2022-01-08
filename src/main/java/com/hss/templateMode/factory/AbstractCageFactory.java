package com.hss.templateMode.factory;

/**
 * 抽象笼子工厂
 */
public abstract class AbstractCageFactory {

    /**
     * 存放东西
     */
    public final void depositary(){
        System.out.println("===========存放东西 start===========");
//        1.打开笼子
        this.openCage();
//        2.判断笼子是不是空的（isEmpty方法是钩子，留给子类改变父类的空间）
        if(!this.isEmpty()){
//            清理
            this.clear();
        }
//        3.放入物品
        this.putInto();
//        4.关闭笼子
        this.closeCage();
        System.out.println("============存放东西 end==========");
    };

    public final void openCage(){
        System.out.println("打开笼子");
    }

    public final void closeCage(){
        System.out.println("关闭笼子");
    }

    public abstract void putInto();

    public abstract Boolean isEmpty();

    public final void clear(){
        System.out.println("清空笼子");
    };
}
