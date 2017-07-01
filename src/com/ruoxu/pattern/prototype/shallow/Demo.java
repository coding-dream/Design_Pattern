package com.ruoxu.pattern.prototype.shallow;

/**
 * 原型模式
 * 知识点(浅拷贝和深拷贝)
 * 浅拷贝:仅拷贝对象本身(一些基本类型的变量和String[特殊])，而不拷贝对象包含的引用，如同 new object(int yes,string yes,Object no);
 * 深拷贝:不仅拷贝对象本身，而且拷贝对象包含的基本变量和引用变量。（开发中建议使用深拷贝而不使用浅拷贝）
 * 使用场景:如果类的初始化(构造函数)需要消耗很大的资源，如数据，硬件资源等，通过原型模式减少消耗，如果创建类的成本很小，那么就没必要使用此模式，直接new。 
 * 使用方法:要让实例调用clone方法就需要让此类实现Cloneable接口(同Serializable类似，Cloneable接口只是个标签接口，不含任何方法)，一般如果你的子类没有特殊需要而重写clone()方法就直接用super.clone() 就行了(原因略)。
 * 注意事项:原型模式是在内存中二进制流的拷贝，要比直接new性能要好得多，但是正因如此，构造函数是不会执行的。
 * 当然不一定非要实现Closeable接口，还可以将对象串行化，implements Serializable，但是串行化却很耗时，这里仅仅实现第一种。
 * 
 * @author limitless
 */
public class Demo {
	public static void main(String[] args) {
		User origin = new User("小明",20,new Address("北京", "崇阳市", "柳州路"));
		System.out.println(origin);
		
		User clone = origin.clone();
		System.out.println(clone);
		
		clone.setName("东东");
		clone.setAge(80);
		clone.getAddress().setCity("上海");
		clone.getAddress().setDistrict("闵行区");
		clone.getAddress().setStreet("莘庄");
		
//		clone.setAddress(new Address("上海", "闵行区", "莘庄")); // 注意这种方式设置是错的，setAddress是一个新的对象，所以不影响origin
		System.out.println(clone);
		
		System.out.println(origin);
		
//		从运行结果可以看出，clone的Address改变后，origin的Address也跟着改变(浅拷贝)。
		
		
	}
}
