package com.ruoxu.pattern.simple_factory;

public class OperationSub implements Operation{

	@Override
	public int calculate(int numberA, int numberB) {
		return numberA - numberB;
	}

}
