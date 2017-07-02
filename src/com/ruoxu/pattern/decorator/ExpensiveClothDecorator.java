package com.ruoxu.pattern.decorator;

public class ExpensiveClothDecorator extends ClothDecorator{

	public ExpensiveClothDecorator(Person person) {
		super(person);
	}

	@Override
	public void dressed() {
		dressedJean();
		super.dressed(); // 位置可在前中后。
		dressShirt();
	}

	private void dressShirt() {
		System.out.println("穿件短袖");
	}

	private void dressedJean() {
		System.out.println("穿上牛仔裤");
	}
}
