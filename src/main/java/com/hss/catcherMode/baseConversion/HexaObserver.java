package com.hss.catcherMode.baseConversion;

import com.hss.catcherMode.baseConversion.Subject;
import com.hss.catcherMode.baseConversion.Observer;

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
