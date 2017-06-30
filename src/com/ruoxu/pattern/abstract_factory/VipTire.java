package com.ruoxu.pattern.abstract_factory;

public class VipTire implements ITire{

	@Override
	public void tire() {
		System.out.println("[tag:factory] 生产==>Vip轮胎");		
	}

}
