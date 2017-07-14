package com.ruoxu.pattern.bridge;
/**
 * 抽象部分的子类
 */
public class SmallCoffee extends Coffee{

	public SmallCoffee(Additives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("小杯的"+impl.addSomething()+"咖啡");
	}
	
}
