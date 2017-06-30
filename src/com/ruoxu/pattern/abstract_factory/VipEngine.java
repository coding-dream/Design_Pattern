package com.ruoxu.pattern.abstract_factory;

public class VipEngine implements IEngine{

	@Override
	public void engine() {
		System.out.println("[tag:factory] 生产==>Vip引擎");		
	}

}
