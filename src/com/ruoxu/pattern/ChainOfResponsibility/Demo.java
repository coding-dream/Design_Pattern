package com.ruoxu.pattern.ChainOfResponsibility;

public class Demo {

	public static void main(String[] args) {
		Okhttp okhttp = Okhttp.create()
				.addInterceptor(new Interceptor() {
			
			@Override
			public Response intercept(Chain chain) {
				System.out.println("=========À¹½ØÆ÷1(before)========="+chain.request());
				Request change = chain.request().addHeader("Cookie: PHPSESSION=CDLJFE");
				Response response = chain.proceed(change);
				System.out.println("=========À¹½ØÆ÷1(after)========="+response);
				response = response.append("<span>title</span>");
				return response;
			}
		})
				.addInterceptor(new Interceptor() {
					
					@Override
					public Response intercept(Chain chain) {
						System.out.println("=========À¹½ØÆ÷2(before)========="+chain.request());
						Request change = chain.request().addHeader("Connection: keep-live");
						Response response = chain.proceed(change);
						System.out.println("=========À¹½ØÆ÷2(after)========="+response);
						response = response.append("<a href='http://baidu.com'/>");
						return response;
					}
				});
		Request request = new Request("GET /index.jsp HTTP/1.1");
		Call call = okhttp.newCall(request);
		Response response = call.execute();
		System.out.println("==========end========="+response);
		
		
		
	}
	
}
