package com.cg.exceptionhandling;

public class NestedTryCatch {

	public static void check() {
		String str = "TNS";
		int slength = str.length();
		System.out.println("String length: " + slength);
		String anotherString = null;
		int y=6;
		try {
			//Inner try
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index is out of bounds: " + ex.getMessage());
			}
			System.out.println("String length" + anotherString.length());
		}catch(NullPointerException npe) {
			System.out.println("Exception is thrown: " + npe.getMessage());
		}
	}
}
