package com.cg.exceptionhandling;

public class MyClass {

	public static void main(String[] args) {

		int x=10;
		int y=0;
		int z;
		try {
			z = x/y;
			System.out.println(z);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
		}
		
		System.out.println("Arithmetic Operation");
	}

}
