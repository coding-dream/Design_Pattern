package com.ruoxu.pattern.ChainOfResponsibility;

public class CallServerInterceptor implements Interceptor{

	@Override
	public Response intercept(Chain chain) {
		// 真正发送请求的拦截器(为了简单，这里模拟Response)
		System.out.println("=========拦截器3(before)========="+chain.request());
		
		Response response = new Response();
		response.setBody("<div>hello</div>");
		return response;
	}

}
