package com.ruoxu.pattern.composite.safe;

public class Demo {
	public static void main(String[] args) {
		// 从下面的例子里面很明显可以看出来 ：两个类虽然都实现了共同的抽象，却都是以实现类来new的，这与【依赖倒置】相违背，定义的抽象Component起的作用就不大。
		// 为了防止这个问题，不安全的组合模式出现了（虽然不安全，但正确使用也没有多大问题）
		Composite root = new Composite("root");
		
		Composite branch1 = new Composite("branch1");
		Composite branch2 = new Composite("branch2");
		
		Leaf leaf1 = new Leaf("leaf1");
		Leaf leaf2 = new Leaf("leaf2");
		
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		
		root.addChild(branch1);
		root.addChild(branch2);
		
		root.doSomething();
	}
}
