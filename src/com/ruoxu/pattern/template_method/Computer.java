package com.ruoxu.pattern.template_method;

public abstract class Computer {
	public final void startUp(){ // 注意： 该方法为final，防止算法框架被篡改。
		System.out.println("=== start ===");
		powerOn();
		checkHardware();
		loadOS();

		if(strict()){
			login();
		}
		
		System.out.println("=== 启动完毕  ===");
	}
	
	private void powerOn(){
		System.out.println("开启电源");
	}
	
	private void checkHardware(){
		System.out.println("硬件检查");
	}
	
	private void loadOS(){
		System.out.println("载入操作系统");
	}
	
	protected abstract void login();
	
	public boolean strict(){//是否严格
		return true;
	}
}
