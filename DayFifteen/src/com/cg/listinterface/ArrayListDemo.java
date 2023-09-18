package com.cg.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List listone = new ArrayList();
//		listone.add(null);
		System.out.println(listone);
		System.out.println(listone.size());
		System.out.println(listone.isEmpty());
		listone.add(10);
		listone.add(20);
		listone.add(true);
		listone.add(false);
		listone.add(20);
		listone.add("Hello");
		listone.add(56.58);
		listone.add(20);
		listone.add('A');
		listone.add(5, "Hi");
		listone.add(20);
		listone.add(null);
		listone.add(4);
		listone.add(242);
		listone.add(123);
		listone.add(54);
		listone.add(3);
		System.out.println(listone);
		
		System.out.println(listone.contains(10));
		listone.remove(false);
		listone.remove(1); //int-index
		System.out.println(listone);
		
		System.out.println(listone.size());
//		System.out.println(listone.get(5));
		
		System.out.println(listone.indexOf(20));
		System.out.println(listone.lastIndexOf(20));
		
//		Collections.sort(listone);
//		System.out.println(listone);
		
		List listTwo = new ArrayList();
		listTwo.add(10);
		listTwo.add(true);
		listTwo.add(false);
		
		
		listone.removeAll(listTwo);
		listone.clear();
		System.out.println(listone);
	}

}
