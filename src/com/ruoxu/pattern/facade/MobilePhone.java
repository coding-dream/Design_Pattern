package com.ruoxu.pattern.facade;

public class MobilePhone {
	private Dialing dialing = new DialingImpl();
	private Camera camera = new SamsungCamera();
	
	public void dial(){
		dialing.dail();
	}
	
	public void videoChat(){
		System.out.println("--->视频连接中......");
		camera.open();
		dialing.dail();
	}
	
	public void hangUp(){
		dialing.hangup();
	}
	
	public void takePicture(){
		camera.open();
		camera.takPicture();
	}
	
	public void closeCamera(){
		camera.close();
	}
}
