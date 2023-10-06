package com.cg.javaeightfeatures;

import java.util.Arrays;
import java.util.List;

class Doubleit{
	public static void doubleit(int i) {
		System.out.println(i*2);
	}
}
public class MethodReferencing {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Collection Output:" + list);
		
		System.out.println("---Internal Iteration---");
		list.forEach(values -> System.out.println(values));
		
		System.out.println("---Method Referencing Output---");
		list.forEach(System.out::println);
		
		System.out.println("---Method Referancig Output - User Defined---");
		list.forEach(Doubleit::doubleit);
	}

}
