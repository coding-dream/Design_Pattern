package com.ruoxu.pattern.simple_factory;

/**
 * 简单工程模式(静态工厂模式)不属于23种设计模式
 * @author Administrator
 */
public class Demo {
	
	public static void main(String[] args) {
		Operation operation = OperationFactory.create("-");
		System.out.println(operation.calculate(3,4));
	}
	
}
