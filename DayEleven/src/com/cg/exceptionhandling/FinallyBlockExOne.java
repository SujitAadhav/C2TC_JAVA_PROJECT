package com.cg.exceptionhandling;

public class FinallyBlockExOne {
	
	public static void devide(int a, int b) {
		try {
			System.out.println("------ Within Try Block ---------");
			int result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException Caught: " + ae.getMessage());
		}
		finally {
			System.out.println("I am finally block");
		}
		System.out.println("Statement after finally block");
	}
}
