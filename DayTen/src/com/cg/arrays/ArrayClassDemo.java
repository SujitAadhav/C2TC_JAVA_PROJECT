package com.cg.arrays;

import java.util.Arrays;

public class ArrayClassDemo {
	
	public static void main(String[] args) {
		int intArr []= {10,20,15,22,35,18,14};
		System.out.println("Array is:" + Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println("------ After Sorting -------");
		System.out.println("Array is:" + Arrays.toString(intArr));
		
		int intKey=22;
		System.out.println(intKey + " Found at index " + Arrays.binarySearch(intArr, intKey));
		System.out.println(intKey + " Found at index " + Arrays.binarySearch(intArr, 1,4, intKey));
		
		int intArrOne[]= {10, 15, 22};
		System.out.println("Array is:" + Arrays.toString(intArrOne));
		
		if(Arrays.equals(intArr, intArrOne)) {
			System.out.println("Both Arrays are equal");
		}
		else {
			System.out.println("Both Arrays are not equal");
		}
		
		int intArrTwo[] = Arrays.copyOf(intArr, 10);
		System.out.println("Array is: " + Arrays.toString(intArrTwo));
		
		int intArrThree[] = Arrays.copyOfRange(intArr, 1, 4);
		System.out.println("Array is: " + Arrays.toString(intArrThree));
		
		Arrays.fill(intArr, intKey);
		System.out.println("Array is: " + Arrays.toString(intArr));
		
		}
}
