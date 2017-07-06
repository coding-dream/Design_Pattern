package com.ruoxu.pattern.iterator;
/**
 * 迭代器模式（用的少）
 * 定义：提供一种方法顺序访问一个容器对象中的各个元素，而不需要暴露该对象的内部表示。
 * 总结：C++，Python，Java，PHP等多种语言都有相应的内置实现，对于开发者而言，已经极少自己实现迭代器了。
 */
public class Demo {
	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<>();
		list.add("Alice");
		list.add("tom");
		
		MyIterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
}
