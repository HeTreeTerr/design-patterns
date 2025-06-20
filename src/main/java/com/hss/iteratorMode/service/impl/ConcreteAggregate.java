package com.hss.iteratorMode.service.impl;

import com.hss.iteratorMode.service.Aggregate;
import com.hss.iteratorMode.service.Iterator;

import java.util.ArrayList;

/**
 * <p>
 * 集合具体实现
 * </p>
 *
 * @author Hss
 * @date 2023-03-30
 */
public class ConcreteAggregate implements Aggregate {

    private ArrayList arrayList = new ArrayList();

    @Override
    public void add(Object o) {
        this.arrayList.add(o);
    }

    @Override
    public void remove(Object o) {
        this.arrayList.remove(o);
    }

    @Override
    public ArrayList getList() {
        return arrayList;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.arrayList);
    }
}
