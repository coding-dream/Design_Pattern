package com.ruoxu.pattern.abstract_factory;

public class Demo {
	
	public static void main(String[] args) {
		Factory factory1 = new Q1Factory();
		IEngine engine1 = factory1.createIEngine();
		ITire iTire1 = factory1.createTire();
		engine1.engine();
		iTire1.tire();
		
		System.out.println("\r\n");
		
		Factory factory7 = new Q7Factory();
		IEngine engine7 = factory7.createIEngine();
		ITire iTire7 = factory7.createTire();
		engine7.engine();
		iTire7.tire();

	}
}
