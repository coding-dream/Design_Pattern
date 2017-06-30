package com.ruoxu.pattern.factory_method.nomal_version;

public class Demo {
	public static void main(String[] args) {
		Factory autoFactory = new AutoFactory();
		Car autoCar = autoFactory.createCar();
		autoCar.drive();
		
		Factory manualFactory = new ManualFactory();
		Car manualCar = manualFactory.createCar();
		manualCar.drive();
	}
}
