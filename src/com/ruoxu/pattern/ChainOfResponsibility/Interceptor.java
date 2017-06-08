package com.ruoxu.pattern.ChainOfResponsibility;

public interface Interceptor {
	 Response intercept(Chain chain);

	  interface Chain {
	    Response proceed(Request request);

		Request request();

	  }
}
