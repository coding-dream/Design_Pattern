package com.ruoxu.pattern.ChainOfResponsibility;

public class CallServerInterceptor implements Interceptor{

	@Override
	public Response intercept(Chain chain) {
		// �������������������(Ϊ�˼򵥣�����ģ��Response)
		System.out.println("=========������3(before)========="+chain.request());
		
		Response response = new Response();
		response.setBody("<div>hello</div>");
		return response;
	}

}
