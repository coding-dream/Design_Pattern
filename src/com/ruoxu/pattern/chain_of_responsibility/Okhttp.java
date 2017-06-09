package com.ruoxu.pattern.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class Okhttp implements Call.Factory{
	private List<Interceptor> interceptors;
	
	public static Okhttp create(){
		Okhttp okhttp = new Okhttp();
		okhttp.interceptors = new ArrayList<>();
		return okhttp;
	}
	
	
	public Okhttp addInterceptor(Interceptor interceptor){
		interceptors.add(interceptor);
		return this;
	}
	
	public List<Interceptor> getInterceptors(){
		return interceptors;
	}

	@Override
	public Call newCall(Request request) {
		return new RealCall(this, request);
	}

	
	
	
}
