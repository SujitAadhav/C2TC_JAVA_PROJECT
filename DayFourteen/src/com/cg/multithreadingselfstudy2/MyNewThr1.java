package com.cg.multithreadingselfstudy2;

public class MyNewThr1 extends Thread{
	
	@Override
	public void run() {
		int i=0;
		while(i<56666) {
			System.out.println("I am Thread One");
			try {
				Thread.sleep(455);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}
