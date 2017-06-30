package com.ruoxu.pattern.abstract_factory;

public class NormalTire implements ITire{

	@Override
	public void tire() {
		System.out.println("[tag:factory] 生产==>普通轮胎");		
	}

}
