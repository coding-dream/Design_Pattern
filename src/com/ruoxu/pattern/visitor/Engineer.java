package com.ruoxu.pattern.visitor;

import java.util.Random;
/**
 * 具体Element，它提供接受访问方法的具体实现，通常情况下是使用访问者提供的方法来访问该元素。
 */
public class Engineer extends Staff{

	public Engineer(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	// 工程师这一年写的代码量
	public int getCodeLines(){
		return new Random().nextInt(10 * 10000);
	}

}
