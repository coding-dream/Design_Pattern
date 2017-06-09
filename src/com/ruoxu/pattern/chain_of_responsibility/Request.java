package com.ruoxu.pattern.chain_of_responsibility;

public class Request {
	String headers ;
	
	public Request(String headers){
		this.headers = headers;
	}
	
	public String getHeaders() {
		return headers;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public Request addHeader(String header){
		headers = headers+"\r\n"+header;
		return this;
	}
	
	@Override
	public String toString() {
		return "\r\n"+headers;
	}
	
	
}
