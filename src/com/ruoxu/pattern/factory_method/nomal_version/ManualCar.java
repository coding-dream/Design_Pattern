package com.ruoxu.pattern.factory_method.nomal_version;

public class ManualCar implements Car {

	@Override
	public void drive() {
		System.out.println("手动汽车==> 启动了");
	}

}
