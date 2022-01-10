package com.hss.catcherMode.baseConversion;

import com.hss.catcherMode.baseConversion.Subject;
import com.hss.catcherMode.baseConversion.Observer;

public class OctalObserver extends Observer{

	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	//Integer.toOctalString(subject.getState()
	//此方法返回int变量的八进制表示的字符串。
	@Override
	public void update() {
		System.out.println("Octal String:"
				+ Integer.toOctalString(subject.getState()));
	}

}
