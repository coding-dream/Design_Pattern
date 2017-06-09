package com.ruoxu.pattern.singleton;

public class Singleton4 {
	// 静态内部类  推荐2
	public static Singleton4 getInstance(){
		return Holder.instance;
	}
	
	private static class Holder{
		private static final Singleton4 instance = new Singleton4();
	}
	
}
