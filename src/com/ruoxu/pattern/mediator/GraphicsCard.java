package com.ruoxu.pattern.mediator;

public class GraphicsCard extends Colleague{

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	public void videoPlay(String dataVideo) {
		System.out.println("视频："+dataVideo);
	}
	
}
