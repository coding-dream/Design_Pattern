package com.ruoxu.pattern.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class RealCall implements Call {
	private boolean executed;
	private Okhttp okhttp;
	private Request originalRequest;

	public RealCall(Okhttp okhttp, Request originalRequest) {
		this.okhttp = okhttp;
		this.originalRequest = originalRequest;
	}

	@Override
	public Request request() {
		return null;
	}

	@Override
	public Response execute() {
		synchronized (this) {
			if (executed)
				throw new IllegalStateException("Already Executed");
			executed = true;
		}

		Response result = getResponseWithInterceptorChain();

		return result;
	}

	private Response getResponseWithInterceptorChain() {
		List<Interceptor> interceptors = new ArrayList<>();
		interceptors.addAll(okhttp.getInterceptors());
		interceptors.add(new CallServerInterceptor());

		Interceptor.Chain chain = new InterceptorChain(interceptors, 0,originalRequest);
		Response response = chain.proceed(originalRequest);
		return response;
	}

}
