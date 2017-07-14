package com.ruoxu.pattern.mediator;

public class CPU extends Colleague{
	private String dataVideo,dataSound;
	
	public CPU(Mediator mediator) {
		super(mediator);
	}

	public void decodeData(String data) {
		// 分隔音视频数据
		String [] tmp = data.split(",");
		dataVideo = tmp[0];
		dataSound = tmp[1];
		
		// 告诉中介者自身状态改变
		mediator.changed(this);
	}

	public String getDataSound() {
		return dataSound;
	}

	public String getDataVideo() {
		return dataVideo;
	}
}
