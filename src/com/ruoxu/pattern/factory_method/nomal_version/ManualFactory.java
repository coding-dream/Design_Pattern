package com.ruoxu.pattern.factory_method.nomal_version;

public class ManualFactory implements Factory{

	@Override
	public Car createCar() {
		return new ManualCar();
	}

}
