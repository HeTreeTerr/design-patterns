package com.hss.dao;

import com.hss.bean.Subject;

public abstract class Observer {
	
	protected Subject subject;
	
	public abstract void update();
}
