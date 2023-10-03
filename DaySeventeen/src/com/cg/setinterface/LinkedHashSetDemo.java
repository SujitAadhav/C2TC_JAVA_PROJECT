package com.cg.setinterface;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Student> lhset = new LinkedHashSet<>();
		/*
		 * lhset.add(61); lhset.add(41); lhset.add(91); lhset.add(null);
		 * lhset.add(null); lhset.add(51); lhset.add(80); lhset.add(11); lhset.add(20);
		 */
		lhset.add(new Student(1,"Sujit"));
		
		
		System.out.println(lhset);
//		Collections.sort(lhset); //CTE - hashset / linkedset
		
		
	}

}
