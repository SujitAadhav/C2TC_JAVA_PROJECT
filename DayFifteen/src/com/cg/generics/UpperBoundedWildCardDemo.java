package com.cg.generics;

import java.util.ArrayList;

public class UpperBoundedWildCardDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Double> doubleList = new ArrayList<>();
		ArrayList<Float> floatList = new ArrayList<>();
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Ajay");
		stringList.add("Rahul");
		
		UpperBoundedWildCard.sumOfList(floatList);
	}

}
