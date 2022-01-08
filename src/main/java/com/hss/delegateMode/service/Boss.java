package com.hss.delegateMode.service;

/**
 * 老板
 */
public interface Boss {

    /**
     * 命令部门领导，执行任务
     * @param action
     * @param leader
     */
    void command(String action,Leader leader);
}
