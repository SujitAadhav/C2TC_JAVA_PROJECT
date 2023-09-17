package com.cg.generics;

public class GenericInterfaceDemo {

	public static void main(String[] args) {

		Float arr[] = {4.23f, 4.63f, 43.234f, 9.0f, 23.1f, 2221.3f, 93.3f};
		MinMaxImpl<Float> objOne = new MinMaxImpl<Float>(arr);
		System.out.println("Minimum value is: " + objOne.min());
		System.out.println("Maximum value is: " + objOne.max());
		
		String arrOne[] = {"Ankit", "Rameshwar", "Shiv", "Durvasa", "Chaitanya", "Aakash", "Amol"};
		MinMaxImpl<String> objTwo = new MinMaxImpl<String>(arrOne);
		System.out.println("Minimum value is: " + objTwo.min());
		System.out.println("Maximum value is: " + objTwo.max());
		
		Person p[] = new Person[] {new Person("Nitin", "Pune"), new Person("Ram", "Ayodhya"), new Person("Shiv", "Kashi"), new Person("Aashutosh", "Varanasi")};
		MinMaxImpl<Person> objThree = new MinMaxImpl<Person>(p);
		System.out.println("Minimum value is: " + objThree.min());
		System.out.println("Maximum value is: " + objThree.max());
	}

}
