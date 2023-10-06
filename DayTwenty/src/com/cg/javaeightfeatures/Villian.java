package com.cg.javaeightfeatures;

public class Villian implements Actor{

	@Override
	public void act() {
		System.out.println("I know to act");
	}

	@Override
	public void speak() {
		System.out.println("I know to speak");
	}
	
	public void cruel() {
		System.out.println("I am cruel");
	}

}
