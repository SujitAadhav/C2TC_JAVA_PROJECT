package com.cg.javaeightfeatures;

public interface Actor {

	void act();
	void speak();
	default void bodyLanguage() {
		System.out.println("I maintain a good body language");
	}
}
