package com.ruoxu.pattern.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 */
public class Demo {
	public static void main(String[] args) {
		ILawsuit poorMan = new PoorMan();
		// 构造一个动态代理
		DynamicProxy dynamicProxy = new DynamicProxy(poorMan);
		// 获得被代理类的ClassLoader
		ClassLoader classLoader = poorMan.getClass().getClassLoader();
		// 动态构造一个动态律师代理类
		ILawsuit lawyerProxy = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, dynamicProxy);
		
		lawyerProxy.submit();
		lawyerProxy.burden();
		lawyerProxy.defend();
		lawyerProxy.finish();
	}

}
