package com.cg.string;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity()); //16
		StringBuffer buffer = new StringBuffer("Hello"); //16 + length of input 
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		StringBuffer s2 = new StringBuffer(200); //exact input as capacity
		System.out.println(s2.capacity());
	}
}
