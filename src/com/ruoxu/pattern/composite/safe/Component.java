package com.ruoxu.pattern.composite.safe;
/**
 * 抽象根节点
 */
public abstract class Component {
	protected String name; // 节点名
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void doSomething();
}
