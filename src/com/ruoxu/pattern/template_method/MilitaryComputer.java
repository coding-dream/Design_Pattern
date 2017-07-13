package com.ruoxu.pattern.template_method;
/**
 * 军用计算机
 */
public class MilitaryComputer extends Computer{

	@Override
	protected void login() {
		System.out.println("输入双重密码加密和指纹识别的方式登录");
	}

}
