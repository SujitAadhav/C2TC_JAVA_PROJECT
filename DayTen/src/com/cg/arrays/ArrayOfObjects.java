package com.cg.arrays;

import java.util.Arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Student arr[] = new Student[5];
//		arr[0] = new Student(1, "Shiv");
//		arr[1] = new Student(2, "Narayan");
//		arr[2] = new Student(3, "Ram");
//		arr[3] = new Student(4, "Krishna");
//		arr[4] = new Student(5, "Aashutosh");
		
		Student arrOne[] = {new Student(1, "Shiv"), new Student(2, "Ram"), new Student(3, "Narayan")};
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i].getRollback() + " " + arr[i].getName());
//		}
		
		
		System.out.println(Arrays.toString(arr));
	}
}
