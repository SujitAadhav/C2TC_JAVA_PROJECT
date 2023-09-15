package com.cg.multithreadingselfstudy2;

public class MyThr extends Thread{

	public MyThr(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		int i = 34; 
		System.out.println("Thank you " + this.getName());
//		while(i<100) {
//			System.out.println("I am a thread");
//			i++;
//		}
	}
}
