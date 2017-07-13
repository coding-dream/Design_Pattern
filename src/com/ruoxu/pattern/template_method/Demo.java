package com.ruoxu.pattern.template_method;
/**
 * 模板方法模式
 * 定义： 定义一个操作中的算法的框架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重新定义改算法的某些特定步骤。
 * 案例：开源中国APP中BaseActivity的设计
 * 使用场景：
 * （1）多个子类有公有的方法，并且逻辑基本相同时。
 * （2）重要，复杂的算法，可以把【核心算法】设计为模板方法，周边的相关细节功能则由各个子类实现。
 * （3）重构时，模板方法是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。
 * 总结：
 * 模板方法模式用4个字概括就是：流程封装，也就是把固定的流程封装到一个final函数中，并让子类能够定制流程中的某些步骤。
 */
public class Demo {
	public static void main(String[] args) {
		Computer computer1 = new CoderComputer();
		computer1.startUp();
		
		System.out.println();
		
		Computer computer2 = new MilitaryComputer();
		computer2.startUp();
	}
}
