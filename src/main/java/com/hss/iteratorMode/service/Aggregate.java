package com.hss.iteratorMode.service;

import java.util.ArrayList;

/**
 * <p>
 * 集合
 * </p>
 *
 * @author Hss
 * @date 2023-03-30
 */
public interface Aggregate {
    /**
     * 添加元素
     * @param o
     */
    void add(Object o);

    /**
     * 移除元素
     * @param o
     */
    void remove(Object o);

    /**
     * 获取列表
     * @return
     */
    ArrayList getList();

    /**
     * 迭代器
     * @return
     */
    Iterator iterator();
}
