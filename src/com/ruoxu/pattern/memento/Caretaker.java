package com.ruoxu.pattern.memento;

public class Caretaker {
	Memento mMemoto; // 备忘录
	/**
	 * 存档
	 */
	public void archive(Memento memoto){
		this.mMemoto = memoto;
	}
	/**
	 * 获取存档
	 */
	public Memento getMemoto(){
		return mMemoto;
	}
}
