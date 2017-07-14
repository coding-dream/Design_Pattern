package com.ruoxu.pattern.visitor;
import java.util.Random;
/**
 * Element(元素接口或者抽象类)，它定义一个接受访问者(accept)的方法，其意义是指每一个元素都要可以被访问者访问到。
 */
public abstract class Staff {
	public String name;
	// 员工kpi
	public int kpi;
	
	public Staff(String name) {
		this.name = name;
		kpi = new Random().nextInt(10);
	}
	// 接受Visitor的访问
	public abstract void accept(Visitor visitor);
}
