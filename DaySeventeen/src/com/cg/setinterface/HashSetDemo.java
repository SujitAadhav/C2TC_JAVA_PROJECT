package com.cg.setinterface;

//Note-1% code is missing in this program

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	static void addElements(Set<Integer> numberHashSet) {
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(null);
		numberHashSet.add(null);
		numberHashSet.add(51);
		numberHashSet.add(80);
		numberHashSet.add(11);
		numberHashSet.add(20);
	}
	public static void main(String[] args) {
		Set<Integer> numberHashSet = new HashSet<>();
		addElements(numberHashSet);
		
		System.out.println(numberHashSet);
		
		Set<Integer> numberHashSetOne = new HashSet<>();
		numberHashSetOne.add(61);
		numberHashSetOne.add(41);
		numberHashSetOne.add(91);
		numberHashSetOne.add(null);
		numberHashSetOne.add(null);
		numberHashSetOne.add(51);
		numberHashSetOne.add(80);
		numberHashSetOne.add(11);
		numberHashSetOne.add(20);
		
		Set<Integer> numberHashSetTwo = new HashSet<>();
		addElements(numberHashSetTwo);
		System.out.println("numberHashSetTwo:" + numberHashSetTwo);
		
		//Union, Intersection, difference
		
		//UNION
		numberHashSetTwo.addAll(numberHashSetTwo);
		
		System.out.println("Union:" + numberHashSetTwo);
		
		//Intersection
		numberHashSetTwo.retainAll(numberHashSetOne);
		System.out.println("Intersection:" + numberHashSetTwo);
		
	}
}
