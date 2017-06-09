package com.ruoxu.pattern.chain_of_responsibility;


public class Response {
	private String body;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Response append(String html) {
		body = body + html;
		return this;
	}
	
	@Override
	public String toString() {
		return "\r\n" + body;
	}
	  
}
