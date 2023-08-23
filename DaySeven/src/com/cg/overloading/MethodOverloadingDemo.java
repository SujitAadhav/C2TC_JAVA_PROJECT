package com.cg.overloading;

public class MethodOverloadingDemo {
	
	// M1 - 2 parameters
	public static int addition(int a, int b) {
		return a+b;
	}
	
	// M2 - Data types of parameters and return type of method
	public static float addition(float a, float b) {
		return a+b;
	}
	
	// M3 - Data type in parameter
	public static float addition(int a, float b) {
		return a+b;
	}
	
	// M4 - Data type in parameter
	public static float addition(float a, int b) {
		return a+b;
	}
	
	public static int addition(float a, int b) {
		return a+b;
	}
	
	// Method Overloading
	// 1. Can be change data type of argument alone - possible
	// 2. Can be change number of argument alone - possible
	// 3. Can be change data type of argument + return type of method - possible
	// 4. Can be change number of argument + return type of method - possible
	// 5. Return type of method alone - not possible
	
	
}
