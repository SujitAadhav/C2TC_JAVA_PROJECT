package com.cg.arrays;

public class MultiLevelArray {

	//c[][]={{1,2,3},{4,5,6},{7,8,9}}
	public static void printArray(int c[][]) {
		System.out.println("Array Elements are as follows:");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.print(c[i][j]);
				System.out.println();
			}
		}
	}
}
