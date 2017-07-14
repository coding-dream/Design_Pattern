package com.ruoxu.pattern.bridge;
/**
 * 抽象部分
 */
public abstract class Coffee {
	protected Additives impl;
	
	public Coffee(Additives impl) {
		this.impl = impl;
	}
	
	public abstract void makeCoffee();
}
