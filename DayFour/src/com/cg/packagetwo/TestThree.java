package com.cg.packagetwo;

import com.cg.packageone.TestOne;

public class TestThree extends TestOne{

	public static void main(String[] args) {
		TestThree t3 = new TestThree();
		t3.id=5;
		System.out.println(t3.id);
		t3.display();
	}
}
