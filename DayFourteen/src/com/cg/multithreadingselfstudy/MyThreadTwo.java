package com.cg.multithreadingselfstudy;

public class MyThreadTwo extends Thread{
	
	@Override
	public void run() {
		int i=0;
		while(i < 40000) {
			System.out.println("My Thread 2 For Chatting with Friends");
			System.out.println("I am sad");
			i++;
		}
	}
}
