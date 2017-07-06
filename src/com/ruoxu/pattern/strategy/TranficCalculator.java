package com.ruoxu.pattern.strategy;
/**
 * 公交车出行价格计算器
 * 讲策略注入到TranficCalculator 中
 */
public class TranficCalculator {
	private CalculatePolicy policy ;
	
	public void setPolicy(CalculatePolicy policy){
		this.policy = policy;
	}
	
	public int calculatePrice(int km){
		return policy.calculatePrice(km);
	}
}
