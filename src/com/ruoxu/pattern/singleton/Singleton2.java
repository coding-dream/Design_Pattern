package com.ruoxu.pattern.singleton;

public class Singleton2 {
	// 懒汉模式
	private static Singleton2 instance;
	
	public static synchronized Singleton2 getInstance(){//synchronized在此处导致速度略慢
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
