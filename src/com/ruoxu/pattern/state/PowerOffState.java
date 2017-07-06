package com.ruoxu.pattern.state;
/**
 * 关机状态，什么都不做
 */
public class PowerOffState implements TvState{
	
	@Override
	public void prevChannel() {
		// nothing to do
	}

	@Override
	public void nextChannel() {
		// nothing to do
	}

	@Override
	public void turnUp() {
		// nothing to do
	}

	@Override
	public void turnDown() {
		// nothing to do
	}

}
