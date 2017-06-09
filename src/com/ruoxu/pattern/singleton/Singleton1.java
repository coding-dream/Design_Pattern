package com.ruoxu.pattern.singleton;

public class Singleton1 {
	// 饿汉模式
	private static final Singleton1 singleton = new Singleton1();
	
	public static Singleton1 getInstance(){
		return singleton;
	}
}
