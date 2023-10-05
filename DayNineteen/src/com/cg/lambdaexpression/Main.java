package com.cg.lambdaexpression;

public class Main {

	public static void main(String[] args) {
//		Implementable imp = new Implementable();
//		imp.display();
		
		
		Inf1 obj = () ->{
			System.out.println("I am a display method using lambda expression");
			System.out.println("I am a method in a functional interface");
		};
		obj.display();
	}

}
