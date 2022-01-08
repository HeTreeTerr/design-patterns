package com.hss.templateMode.factory.extend;

import com.hss.templateMode.factory.AbstractCageFactory;

/**
 * 大象放入笼子
 */
public class ElephantPutCageFactory extends AbstractCageFactory {

    @Override
    public void putInto() {
        System.out.println("把大象放入笼子中");
    }

    /**
     * 实现父类预留的钩子，用来改变父类的执行逻辑
     * @return
     */
    @Override
    public Boolean isEmpty() {
        return true;
    }
}
