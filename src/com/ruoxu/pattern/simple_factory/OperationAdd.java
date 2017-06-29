package com.ruoxu.pattern.simple_factory;

public class OperationAdd implements Operation{

	@Override
	public int calculate(int numberA,int numberB) {
		int result = numberA + numberB;
		return result;
	}

}
