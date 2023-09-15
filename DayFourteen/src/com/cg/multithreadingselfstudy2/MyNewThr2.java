package com.cg.multithreadingselfstudy2;

public class MyNewThr2 extends Thread{

	@Override
	public void run(){
		int i=0;
		while(i<56000) {
			System.out.println("I am Thread 2");
			i++;
		}
	}
}
