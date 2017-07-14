package com.ruoxu.pattern.bridge;
/**
 * 抽象部分的子类
 */
public class LargeCoffee extends Coffee{

	public LargeCoffee(Additives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("大杯的"+impl.addSomething()+"咖啡");
	}
	
}
