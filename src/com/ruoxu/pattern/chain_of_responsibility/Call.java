package com.ruoxu.pattern.chain_of_responsibility;

public interface Call extends Cloneable {
	Request request();
	Response execute();
	
	interface Factory {
	    Call newCall(Request request);
	}
	
	  
}
