package com.ruoxu.pattern.mediator;

public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void soundPlay(String dataSound) {
		System.out.println("音频："+dataSound);
	}
}
