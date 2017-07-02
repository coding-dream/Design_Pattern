package com.ruoxu.pattern.decorator;

public class CheapClothDecorator extends ClothDecorator{

	public CheapClothDecorator(Person person) {
		super(person);
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShorts();
	}

	private void dressShorts() {
		System.out.println("穿件短裤");
	}
}
