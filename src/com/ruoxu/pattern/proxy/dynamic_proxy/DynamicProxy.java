package com.ruoxu.pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	private Object mObject; // 被代理类的引用
	public DynamicProxy(Object object) {
		this.mObject = object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 调用被代理类的方法
		System.out.print("【===Proxy ");
		Object object = method.invoke(mObject, args);
		System.out.println("===】");
		return object;
	}

}
