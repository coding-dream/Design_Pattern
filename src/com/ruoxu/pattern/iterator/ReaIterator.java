package com.ruoxu.pattern.iterator;

import java.util.List;

public class ReaIterator<T> implements MyIterator<T>{
	private List<T> list;
	private int index;
	
	public ReaIterator(List<T> list) {
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		return index != list.size();
	}
	@Override
	public T next() {
		T obj = null;
		if(hasNext()){
			obj = list.get(index++);
		}
		return obj;
	}
	
}
