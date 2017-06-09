package com.ruoxu.pattern.chain_of_responsibility;

public class CallServerInterceptor implements Interceptor{

	@Override
	public Response intercept(Chain chain) {
		//模拟真实请求
		System.out.println("=========拦截器3(before)========="+chain.request());
		
		Response response = new Response();
		response.setBody("<div>hello</div>");
		return response;
	}

}
