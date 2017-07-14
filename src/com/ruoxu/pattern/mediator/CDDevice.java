package com.ruoxu.pattern.mediator;

public class CDDevice extends Colleague{
	private String data;// 视频数据
	
	public CDDevice(Mediator mediator) {
		super(mediator);
	}

	public String read() {
		return data;
	}
	
	public void load(){
		data = "视频数据,音频数据";
		// 告诉中介者自身状态改变
		mediator.changed(this);
	}
	
}
