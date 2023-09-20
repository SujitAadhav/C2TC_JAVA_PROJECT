package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> arrayDeque = new ArrayDeque();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
		
		System.out.println(arrayDeque);
		
		arrayDeque.offer("F");
		
		System.out.println(arrayDeque);
		//For loop
		//For each loop
		//iterator
		//List iterator - only in list interface - arraylist and linkedlist
		//Enumeration 
		
		for(String item:arrayDeque)
			System.out.println(item);
	}

}
