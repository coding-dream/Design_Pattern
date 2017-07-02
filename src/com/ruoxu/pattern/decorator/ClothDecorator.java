package com.ruoxu.pattern.decorator;

public abstract class ClothDecorator implements Person{
	private Person mPerson; // 保持一个Person类的引用
	
	public ClothDecorator(Person person) {
		this.mPerson = person;
	}
	
	@Override
	public  void dressed() {
		mPerson.dressed();
	}

}
