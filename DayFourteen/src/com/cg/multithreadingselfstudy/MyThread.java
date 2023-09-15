package com.cg.multithreadingselfstudy;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		int i=0;
		while(i<40000) {
			System.out.println("My Cooking Thread is Running");
			System.out.println("I am happy");
			i++;
		}
	}
}
