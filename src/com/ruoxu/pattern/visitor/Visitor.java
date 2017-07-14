package com.ruoxu.pattern.visitor;
/**
 * Visitor（接口或者抽象类）方法个数理论应该与【元素个数 Element】是一样的。
 */
public interface Visitor {
	// 访问工程师类型
	void visit(Engineer engineer);
	// 访问经理类型
	void visit(Manager manager);
}
