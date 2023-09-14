package com.tnsif.day01.multithreading;

public class ExecutorClass {
	
	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread(5, "first");
		ChildThread t2 = new ChildThread(10, "second");
		
		t1.start();
//		t1.start();
		t2.start();
	}
}
