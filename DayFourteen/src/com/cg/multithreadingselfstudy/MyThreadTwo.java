package com.cg.multithreadingselfstudy;

public class MyThreadTwo extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("My Thread 2 Running");
			System.out.println("I am sad");
		}
	}
}
