package com.hss.delegateMode.service.impl;

import com.hss.delegateMode.service.Leader;
import com.hss.delegateMode.service.Staff;

import java.util.HashMap;
import java.util.Map;

public class LoaderImpl implements Leader {

    private Map<String,Staff> registerMap = new HashMap<>();

    public LoaderImpl(){
        registerMap.put("business", new StaffAImpl());
        registerMap.put("technique", new StaffBImpl());
    }

    @Override
    public void doSomeThing(String action) {
        Staff staff = registerMap.get(action);
        staff.doSomeThing();
    }
}
