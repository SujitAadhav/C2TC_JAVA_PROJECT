package com.cg.generics;

public class GenericMethod {

	public<E> void displayArrayElements(E[] intarray) {
		for(E a:intarray) {
			System.out.println(a);
		}
		
	}
	
	void display(Person p) {
		System.out.println(p);
	}
}
