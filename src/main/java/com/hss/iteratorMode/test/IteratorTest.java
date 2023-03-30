package com.hss.iteratorMode.test;

import com.hss.iteratorMode.service.Aggregate;
import com.hss.iteratorMode.service.Iterator;
import com.hss.iteratorMode.service.impl.ConcreteAggregate;

/**
 * <p>
 * 迭代器模式测试类
 * </p>
 *
 * @author Hss
 * @date 2023-03-30
 */
public class IteratorTest {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("h2");
        aggregate.add("z3");
        aggregate.add("l4");
        aggregate.add("w5");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.currentItem());
        }
    }
}
