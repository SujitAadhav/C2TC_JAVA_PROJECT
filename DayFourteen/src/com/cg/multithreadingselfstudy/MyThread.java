package com.cg.multithreadingselfstudy;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("My Thread is Running");
			System.out.println("I am happy");
		}
	}
}
