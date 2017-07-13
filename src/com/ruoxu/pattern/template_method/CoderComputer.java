package com.ruoxu.pattern.template_method;
/**
 * 程序员专用计算机
 */
public class CoderComputer extends Computer{

	@Override
	protected void login() {
		System.out.println("只需用户密码即可登录");
	}
	
	@Override
	public boolean strict() {
		return false;
	}
}
