package com.ruoxu.pattern.memento;
/**
 * 穿越火线
 */
public class CF {
	private int mCheckPoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "沙漠之鹰";
	
	public void play(){
		System.out.println("玩游戏 ："+String.format("第 %d 关", mCheckPoint) + "奋战杀敌中");
		mLifeValue -= 10;
		System.out.println("进度升级了");
		mCheckPoint ++;
		System.out.println("到达 "+ String.format("第%d关", mCheckPoint));
	}
	// 退出游戏
	public void quit(){
		System.out.println("========");
		System.out.println("退出前的游戏属性 :"+ this.toString());
		System.out.println("quit");
		System.out.println("========");
	}
	
	public Memento createMemoto(){
		Memento memoto = new Memento();
		memoto.mCheckPoint = mCheckPoint;
		memoto.mLifeValue = mLifeValue;
		memoto.mWeapon = mWeapon;
		return memoto;
	}
	
	// 恢复游戏
	public void restore(Memento memoto){
		this.mCheckPoint = memoto.mCheckPoint;
		this.mLifeValue = memoto.mLifeValue;
		this.mWeapon = memoto.mWeapon;
		System.out.println("恢复后的游戏属性："+this.toString());
	}

	@Override
	public String toString() {
		return "CF [mCheckPoint=" + mCheckPoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon + "]";
	}
}
