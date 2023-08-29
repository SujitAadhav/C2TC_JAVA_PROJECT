package com.cg.string;

public class SampleStringDemo {
	
	public static void main(String[] args) {
//		String s="Hello";
		char ch[] = {'H','e','l','l','o'};
		String s1 = new String(ch);
		
		String s2 = "Hello" + " " + "World";
		System.out.println(s2);
	}
}
