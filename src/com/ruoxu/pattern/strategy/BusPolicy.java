package com.ruoxu.pattern.strategy;

public class BusPolicy implements CalculatePolicy{
	
	/**
	 * 北京公交车，10公里之内1元钱，超过10公里之后每加一元钱可以乘坐5公里
	 * @param km
	 * @return
	 */
	@Override
	public int calculatePrice(int km) {
		int extraTotal = km - 10;
		int extraFactor = extraTotal / 5;
		int fraction = extraTotal % 5;
		int price = 1 + extraFactor * 1;
		return fraction > 0? ++price : price;
	}
	
}
