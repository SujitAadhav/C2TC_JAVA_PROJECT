package com.cg.interfaces;

interface Dad{
	void snoring();
	void riding();
}

interface Mom{
	void snoring();
	void cleaning();
}

class You implements Dad, Mom{

	@Override
	public void snoring() {
		// TODO Auto-generated method stub
		System.out.println("I have habbit of snoring and I got it from my Mom and Dad");
	}

	@Override
	public void cleaning() {
		// TODO Auto-generated method stub
		System.out.println("I got the habbit of cleaning from Mom");
	}

	@Override
	public void riding() {
		// TODO Auto-generated method stub
		System.out.println("I got the habbit of riding from Dad");
	}
}

public class MultipleInheritenceI {
	
	public static void main(String[] args) {
		You y = new You();
		y.snoring();
		y.cleaning();
		y.riding();
	}
}
