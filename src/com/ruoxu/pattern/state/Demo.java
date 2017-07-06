package com.ruoxu.pattern.state;
/**
 * 状态模式
 * 注意： 策略模式和状态模式 的结构几乎完全一样，但是他们的目的，本质却不一样。
 * 策略模式的行为是彼此独立，可相互替换的。
 * 状态模式的行为是平行，不可替换的。
 * 
 * 使用场景：
 * 一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为。
 * 代码中有大量if-else或者switch，且这些分支依赖于该对象的状态
 */
public class Demo {
	public static void main(String[] args) {
		TvController tvController = new TvController();
		tvController.powerOn();
		
		tvController.prevChannel();
		tvController.nextChannel();
		tvController.turnUp();
		tvController.turnDown();
		
		tvController.powerOff();
		tvController.prevChannel();
		tvController.nextChannel();
	}
}
