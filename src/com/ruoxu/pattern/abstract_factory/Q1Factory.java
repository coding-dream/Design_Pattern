package com.ruoxu.pattern.abstract_factory;

public class Q1Factory implements Factory{
	
	@Override
	public ITire createTire() {
		return new NormalTire();
	}

	@Override
	public IEngine createIEngine() {
		return new VipEngine();
	}

}
