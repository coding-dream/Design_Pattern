package com.ruoxu.pattern.chain_of_responsibility;

public interface Interceptor {
	 Response intercept(Chain chain);

	  interface Chain {
	    Response proceed(Request request);

		Request request();

	  }
}
