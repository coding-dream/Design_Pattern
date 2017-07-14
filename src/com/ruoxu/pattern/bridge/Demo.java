package com.ruoxu.pattern.bridge;
/**
 * 桥接模式（用的不多，缺点：不容易设计）桥->简而言之其作用就是连接河的两边。
 * 定义：将抽象部分和实现部分   分离(即解耦)，使它们都可以独立地进行变化。这个概念很难理解。
 * 这里的抽象和实现指的并不是 抽象类和其派生类的分离，这没有任何意义。
 * 定义的通俗理解：系统可能有多角度分类，每种分类都有可能变化，那么就把这种多角度分离出来(角度1和角度2分离<==>抽象和实现分离)让它们独立变化，减少它们之间的耦合。
 * 根据UML图，此设计模式的抽象部分和实现部分就是指 角度1和角度2，该概念也让人难以理解，直接看代码即可。
 * 
 * 多继承和桥接模式比较：
 * 桥接模式用一种巧妙的方式处理多层继承存在的问题，用抽象关联取代了传统的多层继承，多继承方案往往违背了类的单一职责原则（即一个类只有一个变化的原则），
 * 且多继承方案的复用性比较差。如果2*2则需要4个类来继承，Bridge模式是比多继承方案更好的解决方法。
 * 桥接模式将继承关系转化成关联关系，它降低了类与类之间的耦合度，减少了系统中类的数量，也减少了代码量。
 * 
 * 使用场景：
 * 任何多维变化或多个树状类之间的耦合都可以使用桥接模式来实现解耦。对于两个独立变化的维度，使用桥接模式再适合不过了。
 */
public class Demo {
	public static void main(String[] args) {
		// 原汁原味
		OrdinaryAdditives implOrdinary= new OrdinaryAdditives();
		// 加糖
		SugerAdditives implSuger= new SugerAdditives();
		
		LargeCoffee largeOridinaryCoffee = new LargeCoffee(implOrdinary);
		largeOridinaryCoffee.makeCoffee();

		LargeCoffee largeSugerCoffee = new LargeCoffee(implSuger);
		largeSugerCoffee.makeCoffee();
		
		SmallCoffee smallOridinaryCoffee = new SmallCoffee(implOrdinary);
		smallOridinaryCoffee.makeCoffee();
		
		SmallCoffee smallSugerCoffee = new SmallCoffee(implSuger);
		smallSugerCoffee.makeCoffee();
		
		
	}
}
