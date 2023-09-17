package com.cg.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<Integer> gc = new GenericClass<Integer>();
		gc.set(10);
		System.out.println(gc.get());
		
		GenericClass<Double> gcOne = new GenericClass<Double>();
		gcOne.set(10.0);
		System.out.println(gcOne.get());
		
		GenericClass<String> gcTwo = new GenericClass<String>();
		gcTwo.set("10");
		System.out.println(gcTwo.get());
	}

}
