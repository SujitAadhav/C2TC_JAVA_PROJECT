package com.cg.wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//Unboxing = Object to Primitive
		Integer j = new Integer(10);	//Wrapper or Object Type
		int k = j.intValue();
		
		//Autoboxing = Primitive to Object
		int i=10;	//Primitive Type
		Integer a = new Integer(10);
		Integer b = i;
		
		System.out.println(args[0]);
	}

}
