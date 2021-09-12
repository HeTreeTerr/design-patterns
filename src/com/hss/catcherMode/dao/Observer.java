package com.hss.catcherMode.dao;

import com.hss.catcherMode.bean.Subject;

public abstract class Observer {
	
	protected Subject subject;
	
	public abstract void update();
}
