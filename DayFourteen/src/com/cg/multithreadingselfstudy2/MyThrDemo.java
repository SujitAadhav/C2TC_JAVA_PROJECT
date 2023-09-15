package com.cg.multithreadingselfstudy2;

public class MyThrDemo {

	public static void main(String[] args) {
		
		MyThr t = new MyThr("Sujit");
		MyThr t2 = new MyThr("John Doe");
		t.start();
		t2.start();
		System.out.println("The id of the thread t is " + t.getId());
		System.out.println("The name of thread t is " + t.getName());
		System.out.println("The id of the thread t is " + t2.getId());
		System.out.println("The name of thread t is " + t2.getName());
	}

}
