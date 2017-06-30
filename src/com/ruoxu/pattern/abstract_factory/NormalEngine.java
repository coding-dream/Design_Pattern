package com.ruoxu.pattern.abstract_factory;

public class NormalEngine implements IEngine{
	
	@Override
	public void engine() {
		System.out.println("[tag:factory] 生产==>普通引擎");
	}

}
