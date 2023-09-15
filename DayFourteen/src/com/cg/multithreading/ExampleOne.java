package com.cg.multithreading;

class Eclipse extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("In Eclipse Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getPriority());
	}
}

class Chrome extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("In Chrome Thread");
		}
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class ExampleOne{
	
	public static void main(String[] args) {
		Eclipse e = new Eclipse();
		e.start();
		e.setPriority(1);
		Chrome c = new Chrome();
		c.start();
		c.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
	}
}
