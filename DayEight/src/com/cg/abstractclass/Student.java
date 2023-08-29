package com.cg.abstractclass;

public abstract class Student {
	
	// variable
	int id;
	
	// constructor
	public Student() {
		System.out.println("Student Constructor");
	}
	
	// method - non abstract method
	public void display() {
		
	}
	
	// method - abstract method
	public abstract void show();
	
}
