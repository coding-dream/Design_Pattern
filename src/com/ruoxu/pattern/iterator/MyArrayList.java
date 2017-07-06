package com.ruoxu.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> implements MyList<T>{
	private List<T> list = new ArrayList<>();
	
	@Override
	public void add(T t) {
		list.add(t);
	}

	@Override
	public void remove(T t) {
		list.remove(t);
	}

	@Override
	public MyIterator<T> iterator() {
		
		return new ReaIterator<>(list);
	}
	
}
