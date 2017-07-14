package com.ruoxu.pattern.bridge;
/**
 * 实现部分的具体实现
 */
public class OrdinaryAdditives implements Additives{

	@Override
	public String addSomething() {
		return "原味";
	}

}
