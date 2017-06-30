package com.ruoxu.pattern.abstract_factory;

public interface Factory {
	/**
	 * 生产轮胎
	 *
	 * @return
	 */
	ITire createTire();
	/**
	 * 生产发动机 
	 * 
	 * @return 轮胎
	 */
	IEngine createIEngine();
	
}
