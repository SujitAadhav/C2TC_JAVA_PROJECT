package com.tnsif.day01.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
//		new UsingRunnable(30, 20, "Hello");
		Thread t1 = Thread(new UsingRunnable(30,20,"Hello from thread"));
		t1.start();
	}


}
