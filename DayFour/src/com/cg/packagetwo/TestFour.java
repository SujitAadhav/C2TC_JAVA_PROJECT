package com.cg.packagetwo;

import com.cg.packageone.TestOne;

public class TestFour extends TestOne{
	
	public static void main(String[] args) {
		TestFour t4 = new TestFour();
		t4.id=5;
		System.out.println(t4.id);
		t4.display();
	}
}
