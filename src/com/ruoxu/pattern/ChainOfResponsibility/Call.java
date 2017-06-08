package com.ruoxu.pattern.ChainOfResponsibility;

public interface Call extends Cloneable {
	Request request();
	Response execute();
	
	interface Factory {
	    Call newCall(Request request);
	}
	
	  
}
