package com.cg.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3);
		UnBoundedWildCard.display(intList);
		
		List<String> strList = Arrays.asList("Hello", "Welcome", "to", "Session");
		UnBoundedWildCard.display(strList);
		
		Person p[] = new Person[] {new Person("Vinit", "Bhusaval"), new Person("Tejas", "Jalgaon"), new Person("Rahul", "Mumbai")};
		List<Person> personList = Arrays.asList(p);
		UnBoundedWildCard.display(personList);
	}

}
