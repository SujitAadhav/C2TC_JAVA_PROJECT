package com.cg.generics;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		
		GenericConstructor gc = new GenericConstructor(10);
		gc.show();
		
		GenericConstructor gcOne = new GenericConstructor(136.8F);
		gcOne.show();
	}

}
