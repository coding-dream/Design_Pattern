package com.ruoxu.pattern.prototype;

/**
 * 原型模式
 * 知识点(浅拷贝和深拷贝)
 * 浅拷贝:仅拷贝对象本身(一些基本类型的变量和String[特殊])，而不拷贝对象包含的引用，如同 new object(int yes,string yes,Object no);
 * 深拷贝:不仅拷贝对象本身，而且拷贝对象包含的基本变量和引用变量。（开发中建议使用深拷贝而不使用浅拷贝）
 * 使用场景:如果类的初始化(构造函数)需要消耗很大的资源，如数据，硬件资源等，通过原型模式减少消耗，如果创建类的成本很小，那么就没必要使用此模式，直接new。 
 * 使用方法:要让实例调用clone方法就需要让此类实现Cloneable接口(同Serializable类似，Cloneable接口只是个标签接口，不含任何方法)，一般如果你的子类没有特殊需要而重写clone()方法就直接用super.clone() 就行了(原因略)。
 * 注意事项:原型模式是在内存中二进制流的拷贝，要比直接new性能要好得多，但是正因如此，构造函数是不会执行的。
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		
	}
}
