package com.cg.string;

class Sample{
	
}

class Demo{
	public Demo() {
		System.out.println("In Constructor");
	}
	
	protected void finalize() {
		System.out.println("In finailize");
	}
}

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		Sample s1 = new Sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		Demo d = new Demo();
		System.out.println(d.hashCode());
		Demo d1 = d;
		System.out.println(d1.hashCode());
		//d1=null; //d1=null wrong
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println("Hello");
	}
}
