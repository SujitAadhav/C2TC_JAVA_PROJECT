package com.cg.generics;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		int[] intarray = {10,20,30,40,50};
		String[] str = {"Java", "Programming", "Learning"};
		Person[] p = {new Person("Sujit", "Jalgaon"),new Person("Gaurav", "Pune"),new Person("Neha", "Nashik")};
		Float[] floatarray = {10.0f, 20.0f, 30.0f, 40.0f, 50.0f};
		GenericMethod gm = new GenericMethod();
//		gm.displayArrayElements(intarray);
		gm.displayArrayElements(str);
		gm.displayArrayElements(p);
		gm.displayArrayElements(floatarray);
		
		
		gm.display(new Person("Sujit", "Jalgaon"));
//		gm.show(10);
	}

}
