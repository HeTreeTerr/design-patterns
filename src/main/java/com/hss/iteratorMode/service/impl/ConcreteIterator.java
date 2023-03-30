package com.hss.iteratorMode.service.impl;

import com.hss.iteratorMode.service.Iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * <p>
 * 迭代器具体实现类
 * </p>
 *
 * @author Hss
 * @date 2023-03-30
 */
public class ConcreteIterator<E> implements Iterator<E> {

    /** 游标 */
    private int cursor;
    /** 集合 */
    private ArrayList arrayList;

    public ConcreteIterator(ArrayList arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor >= this.arrayList.size()){
            return false;
        }
        return true;
    }

    @Override
    public void next() {
        this.cursor++;
        System.out.println("cursor -->" + cursor);
    }

    @Override
    public E currentItem() {
        if(this.cursor >= this.arrayList.size()){
            throw new NoSuchElementException();
        }
        E e = (E)arrayList.get(cursor);
        this.next();
        return e;
    }
}
