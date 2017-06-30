package com.ruoxu.pattern.factory_method.nomal_version;

public class AutoCar implements Car {

	@Override
	public void drive() {
		System.out.println("自动汽车==> 启动了");
	}

}
