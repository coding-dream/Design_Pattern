package com.ruoxu.pattern.singleton;

public class Singleton3 {
	// Double Check Lock(DCL) 推荐1  
	private static Singleton3 instance = null;
	
	public static Singleton3 getInstance(){
		if(instance == null){
			synchronized (Singleton3.class) {
				if(instance==null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
