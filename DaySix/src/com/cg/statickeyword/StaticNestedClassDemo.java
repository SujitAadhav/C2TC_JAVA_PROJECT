package com.cg.statickeyword;

public class StaticNestedClassDemo {
	
	static int data=30;
	static class Nested{
		void msg() {
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClassDemo.Nested n = new StaticNestedClassDemo.Nested();
		n.msg();
	}
}
