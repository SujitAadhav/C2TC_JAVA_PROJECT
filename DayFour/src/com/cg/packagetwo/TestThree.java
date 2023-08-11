package com.cg.packagetwo;

import com.cg.packageone.TestOne;

public class TestThree{

	public static void main(String[] args) {
		TestOne t1 = new TestOne();
		t1.id=5;
		System.out.println(t1.id);
		t1.display();
	}
}
