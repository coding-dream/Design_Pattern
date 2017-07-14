package com.ruoxu.pattern.memento;

public class Memento {

	public int mCheckPoint;
	public int mLifeValue;
	public String mWeapon;

	@Override
	public String toString() {
		return "Memoto [mCheckPoint=" + mCheckPoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon + "]";
	}
}
