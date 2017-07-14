package com.ruoxu.pattern.facade;

public class DialingImpl implements Dialing{

	@Override
	public void dail() {
		System.out.println("打电话");
	}

	@Override
	public void hangup() {
		System.out.println("挂断");
	}

}
