package com.cg.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCardDemo {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3);
		LowerBoundedWildCard.displayNumber(intList);
		
		List<Number> numberList = Arrays.asList(1,2,3);
		LowerBoundedWildCard.displayNumber(numberList);
		
		// This will throw the error
//		List<Float> floatList = Arrays.asList(1.2f, 3.1f, 23.2f);
//		LowerBoundedWildCard.displayNumber(floatList);
	}

}
