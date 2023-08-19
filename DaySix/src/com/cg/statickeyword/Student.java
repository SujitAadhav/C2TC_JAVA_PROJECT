package com.cg.statickeyword;

public class Student {
	
	private int id;
	private String name;
	private static String department = "CSE";
	private static String batchno = "B70";
	private static String collegeName = "KCE";
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(id + " " + name + " " + department + " " + batchno + " " + collegeName);
	}


	
	
}
