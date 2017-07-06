package com.ruoxu.pattern.iterator;

public interface MyList<T>{
	
	void add(T t);
	
	void remove(T t);
	
	MyIterator<T> iterator();
}
