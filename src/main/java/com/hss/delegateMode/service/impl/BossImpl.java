package com.hss.delegateMode.service.impl;

import com.hss.delegateMode.service.Boss;
import com.hss.delegateMode.service.Leader;

public class BossImpl implements Boss {

    @Override
    public void command(String action, Leader leader) {
        leader.doSomeThing(action);
    }
}
