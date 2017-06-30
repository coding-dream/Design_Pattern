package com.ruoxu.pattern.factory_method.optmize_version;

public class Demo {
	public static void main(String[] args) {
		Factory commonFactory = new CommonFactory();
		
		Car autoCar = commonFactory.createCar(AutoCar.class);
		autoCar.drive();
		
		Car manualCar = commonFactory.createCar(ManualCar.class);
		manualCar.drive();
	}
}
