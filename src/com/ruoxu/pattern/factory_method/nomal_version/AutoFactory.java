package com.ruoxu.pattern.factory_method.nomal_version;

public class AutoFactory implements Factory{

	@Override
	public Car createCar() {
		return new AutoCar();
	}

}
