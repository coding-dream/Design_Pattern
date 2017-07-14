package com.ruoxu.pattern.visitor;
/**
 * 访问者模式（使用频率不高，23种设计模式中最复杂的一个）
 * 定义：封装一些作用于某种数据结构中的各元素的操作，它可以在不改变这个数据结构的前提下定义作用于这些元素的新的操作。
 * 
 * 使用场景：
 * 1.对象结构比较稳定，但经常需要在此对象结构上定义新的操作
 * 2.需要对一个对象结构中的对象进行 很多【不同的并且不相关】的操作，而需要避免这些做操【污染】这些对象的类，也不希望在增加新操作时【污染】这些对象的类，也不希望增加新操作时修改这些类。
 * 
 * 总结：大多数情况下，你并不需要访问者模式，但是当你一旦需要使用它时，那就真的需要它了。
 * 缺点：
 * 1.具体元素对访问者公布细节，违反了迪米特原则。
 * 2.具体元素变更时导致修改成本大
 * 3.违反了依赖倒置原则，为了达到【区别对待】而依赖了具体类，没有依赖抽象。
 */
public class Demo {
	public static void main(String[] args) {
		// 案例：年终时，公司都会给员工进行业绩考核，以此评定该员工的年终奖和晋升等等， 这些评定都是由公司高层负责。我们简单把员工分为 工程师和经理，评定人分为CEO和CTO。
		// 假定CEO只关注工程师的的KPI和经理的KPI，CTO只关注工程师的代码量和经理的新产品数量。
		BusinessReport businessReport = new BusinessReport();
		
		System.out.println("===========    给CEO看的报表          ===========");
		businessReport.showReport(new CEOVisitor());

		System.out.println("\n===========    给CTO看的报表          ===========");
		businessReport.showReport(new CTOVisitor());
	}
}
