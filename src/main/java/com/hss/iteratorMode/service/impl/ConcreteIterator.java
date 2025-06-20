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
    /** 上一个位置的游标 */
    private int lastLet = -1;
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
        this.lastLet = cursor;
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

    @Override
    public void remove() {
        if(0 > lastLet){
            throw new RuntimeException("lastLet值异常");
        }
        arrayList.remove(this.lastLet);
        this.cursor = lastLet;
        this.lastLet = -1;
    }
}
