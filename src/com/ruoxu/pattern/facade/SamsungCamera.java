package com.ruoxu.pattern.facade;

public class SamsungCamera implements Camera{

	@Override
	public void open() {
		System.out.println("打开相机");
	}

	@Override
	public void takPicture() {
		System.out.println("拍照");
	}

	@Override
	public void close() {
		System.out.println("关闭相机");
	}

}
