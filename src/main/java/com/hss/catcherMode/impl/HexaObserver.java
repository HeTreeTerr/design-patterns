package com.hss.catcherMode.impl;

import com.hss.catcherMode.bean.Subject;
import com.hss.catcherMode.dao.Observer;

public class HexaObserver extends Observer{

	
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex string:"
				+ Integer.toHexString(subject.getState())
				.toUpperCase());
	}

}
