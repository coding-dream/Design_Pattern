package com.ruoxu.pattern.proxy.static_proxy;

/**
 * 静态代理
 * 
 *
 */
public class Demo {
	public static void main(String[] args) {
		ILawsuit poorMan = new PoorMan();
		LawyerProxy lawyerProxy = new LawyerProxy(poorMan);
		lawyerProxy.submit();
		lawyerProxy.burden();
		lawyerProxy.defend();
		lawyerProxy.finish();
		
		System.out.println();
		
		ILawsuit wealthMan = new WealthMan();
		LawyerProxy proxy = new LawyerProxy(wealthMan);
		proxy.submit();
		proxy.burden();
		proxy.defend();
		proxy.finish();
	}
}
