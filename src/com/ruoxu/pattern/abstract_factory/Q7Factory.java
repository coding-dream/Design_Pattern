package com.ruoxu.pattern.abstract_factory;

public class Q7Factory implements Factory{

	@Override
	public ITire createTire() {
		return new VipTire();
	}

	@Override
	public IEngine createIEngine() {
		return new VipEngine();
	}
	
}
