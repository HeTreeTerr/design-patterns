package com.hss.iteratorMode.service;

/**
 * <p>
 * 迭代器
 * </p>
 *
 * @author Hss
 * @date 2023-03-30
 */
public interface Iterator<E> {
    /**
     * 判断容器是否有值
     * @return
     */
    boolean hasNext();

    /**
     * 把游标指向下一个指针
     */
    void next();

    /**
     * 当前遍历的数据
     * @return
     */
    E currentItem();
}
