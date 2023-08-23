package com.cg.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		//Dynamic Binding
		rbi = new SBI();
//		System.out.println(rbi.getRateOfInterest());
		System.out.println(rbi.getClass());
		rbi = new HDFC();
//		System.out.println(rbi.getRateOfInterest());
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
	}

}
