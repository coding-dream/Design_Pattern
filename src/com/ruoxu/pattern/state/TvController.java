package com.ruoxu.pattern.state;

public class TvController implements PowerController{
	private TvState mTvState;
	
	@Override
	public void powerOn() {
		setTvState(new PowerOnState());
		System.out.println("==== 开机了  ====");
	}

	@Override
	public void powerOff() {
		setTvState(new PowerOffState());
		System.out.println("==== 关机了  ====");
	}
	
	public void prevChannel() {
		mTvState.prevChannel();
	}

	public void nextChannel() {
		mTvState.nextChannel();
	}

	public void turnUp() {
		mTvState.turnUp();
	}

	public void turnDown() {
		mTvState.turnDown();
	}

	private void setTvState(TvState tvState){
		this.mTvState = tvState;
	}
}
