package com.cg.lambdaexpression;

//class Eclipse implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("I am in eclipse run method");
//	}
//	
//}
public class Multithreading {

	public static void main(String[] args) {
//		Eclipse e = new Eclipse();
//		Thread obj = new Thread(e);
//		obj.start();
		
		new Thread(() -> {System.out.println("I am in eclipse run method");}).start();
	}

}
