package com.hss.impl;

import com.hss.bean.Subject;
import com.hss.dao.Observer;

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
