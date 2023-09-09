package com.cg.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClassThree {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("G:/myfile.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		int k;
			try {
				while(  ( k=fis.read() ) != -1 ) {
					System.out.println((char)k);
				}
				
				fis.close();
			} catch (Exception e) {
				System.out.println("File can't be read and closed");
			}
	}

}

//Compile Time Exception - Checked Exception
//Run Time Exception
