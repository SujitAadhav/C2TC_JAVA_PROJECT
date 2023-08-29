package com.cg.string;

public class StringOperationsDemo {

	public static void main(String[] args) {
		
		String s1 = new String(" indian ");
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,6));
		//start exact mention = 4
		//end exact mention -1 = 6-1 = 5 
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading()); //remove starting space
		System.out.println(s1.stripTrailing()); //remove ending space
		String s3 = "Hello";
		String s4 = new String("Hello");
		System.out.println(s3==s4); //F
		System.out.println(s3.equals(s4)); //T
		
		
	}
}
