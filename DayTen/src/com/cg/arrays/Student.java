package com.cg.arrays;

public class Student {
	
	private int rollback;
	private String name;
	
	
	public Student(int rollback, String name) {
		super();
		this.rollback = rollback;
		this.name = name;
	}


	public int getRollback() {
		return rollback;
	}


	public void setRollback(int rollback) {
		this.rollback = rollback;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
