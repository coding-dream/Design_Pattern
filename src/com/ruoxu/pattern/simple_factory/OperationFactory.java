package com.ruoxu.pattern.simple_factory;

public class OperationFactory {
	public static Operation create(String oper){
		Operation operation = null;
		switch (oper) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		default:
			break;
		}
		return operation;
	}
}
