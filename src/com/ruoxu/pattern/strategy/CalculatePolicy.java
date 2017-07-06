package com.ruoxu.pattern.strategy;

public interface CalculatePolicy {
	/**
	 * 按照距离来计算价格
	 * @param km 公里
	 * @return 返回价格
	 */
	int calculatePrice(int km);
	
}
