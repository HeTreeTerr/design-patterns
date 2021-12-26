package com.hss.catcherMode.impl;

import com.hss.catcherMode.bean.Subject;
import com.hss.catcherMode.dao.Observer;

public class BinaryObserver extends Observer{

	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	//Integer.toBinaryString(subject.getState()
	//此方法返回int变量的二进制表示的字符串
	@Override
	public void update() {
		System.out.println("Binary String:"
				+ Integer.toBinaryString(subject.getState()));
	}
	
}
