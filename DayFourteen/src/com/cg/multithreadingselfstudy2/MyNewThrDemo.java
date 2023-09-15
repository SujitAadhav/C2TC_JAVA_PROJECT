package com.cg.multithreadingselfstudy2;

public class MyNewThrDemo {

	public static void main(String[] args) {
		MyNewThr1 t1 = new MyNewThr1();
		MyNewThr2 t2 = new MyNewThr2();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
	}
}
