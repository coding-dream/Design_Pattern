package com.ruoxu.pattern.chain_of_responsibility;

import java.util.List;


public class InterceptorChain implements Interceptor.Chain{
	private List<Interceptor> interceptors;
	private int index;
	private Request request;
	
	public InterceptorChain(List<Interceptor> interceptors,int index,Request request) {
		this.interceptors = interceptors;
	    this.index = index;
	    this.request = request;
	}
	  
	@Override
	public Response proceed(Request request) {
		System.out.println("\r\n=======index: "+index+"==========");
		if (index >= this.interceptors.size()) throw new AssertionError();
		
        Interceptor interceptor = this.interceptors.get(index);
        Interceptor.Chain chain = new InterceptorChain(interceptors,index + 1, request);
        Response interceptedResponse = interceptor.intercept(chain);
        
		return interceptedResponse;
	}
	@Override 
	public Request request() {
	    return request;
	  }
}
