package com.cg.javaeightfeatures;

public class Hero implements Actor{

	@Override
	public void act() {
		System.out.println("I know to act");
	}

	@Override
	public void speak() {
		System.out.println("I know to speak");
	}

	public void humble() {
		System.out.println("I am a humble person");
	}
}
