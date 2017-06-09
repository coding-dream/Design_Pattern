package com.ruoxu.pattern.singleton;

public class Demo {
	public static void main(String[] args) {
		Singleton1 instance11 = Singleton1.getInstance();
		Singleton1 instance12 = Singleton1.getInstance();
		
		Singleton2 instance21 = Singleton2.getInstance();
		Singleton2 instance22 = Singleton2.getInstance();

		Singleton3 instance31 = Singleton3.getInstance();
		Singleton3 instance32 = Singleton3.getInstance();

		Singleton4 instance41 = Singleton4.getInstance();
		Singleton4 instance42 = Singleton4.getInstance();

		System.out.println(instance11==instance12);
		System.out.println(instance21==instance22);
		System.out.println(instance31==instance32);
		System.out.println(instance41==instance42);
		
		
	}
}
