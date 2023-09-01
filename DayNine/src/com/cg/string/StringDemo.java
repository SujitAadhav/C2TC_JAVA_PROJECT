package com.cg.string;

public class StringDemo {
	
	public static void main(String[] args) {
		//String literal / using new keyword
		String str = new String("Study");
		str = str.concat("Night");	//concatenation
		System.out.println(str);
		
		//StringBuilder
//		StringBuffer s = "Hello";
		StringBuffer s1 = new StringBuffer("Study");
		s1.append("Night");
		System.out.println(s1);
	}
}
