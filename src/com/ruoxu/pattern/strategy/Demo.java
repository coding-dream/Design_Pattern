package com.ruoxu.pattern.strategy;
/**
 * 策略模式
 * 注意： 策略模式和状态模式 的结构几乎完全一样，但是他们的目的，本质却不一样。
 * 策略模式的行为是彼此独立，可相互替换的。
 * 状态模式的行为是平行，不可替换的。
 * 
 * 定义：
 * 策略模式定义了一系列的算法，并将每一种算法封装起来，并且使他们可以相互替换，策略模式让算法独立于使用它的客户而独立变化。
 * 
 * 使用场景：
 * 针对同一类型问题的多种处理方式，仅仅是具体行为有差别
 * 需要安全地封装多种同一类型的操作时
 * 出现同一抽象类有多个子类，而又需要使用if-else或者switch来选择子类时
 * 
 */
public class Demo {
	public static void main(String[] args) {
		int num = 6;
		TranficCalculator calculator = new TranficCalculator();
		calculator.setPolicy(new BusPolicy());
		int price = calculator.calculatePrice(num);
		System.out.println("公交车乘"+num+"公里的价格是："+price);
		
		
		
		
		
		
	}
}
