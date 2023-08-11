package com.cg.test;


// 1. using class name
//import com.cg.demo.Person; // 1
//import com.cg.demo.Employee; // 1

// 2. using *
//import com.cg.demo.*;


public class Main {

	public static void main(String[] args) {
		// 3. using fully qualified name // package+class
		com.cg.demo.Person p = new com.cg.demo.Person();
		com.cg.demo.Employee e = new com.cg.demo.Employee();
	}

}
