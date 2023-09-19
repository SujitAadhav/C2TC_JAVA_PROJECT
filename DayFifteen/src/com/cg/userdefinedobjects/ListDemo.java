package com.cg.userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student(22,"Sujit",95));
		listStudent.add(new Student(14,"Amogh",87));
		listStudent.add(new Student(65,"Dhirendra",99));
		listStudent.add(new Student(24,"Vivek",32));
		listStudent.add(new Student(43,"Vasu",45));
		listStudent.add(new Student(1,"Krishna",100));
		
		System.out.println("-------Before Sorting-----------");
		System.out.println(listStudent);
		
		Collections.sort(listStudent);
		
		System.out.println("----------After Sorting----------");
		System.out.println(listStudent);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Sujit", "Jalgaon"));
		personList.add(new Person("Aishwarya", "Canada"));
		personList.add(new Person("Shilpa", "Banglore"));
		personList.add(new Person("Vaishnavi", "Pune"));
		personList.add(new Person("Sindhu", "Karnataka"));
		personList.add(new Person("Vinita", "Mumbai"));
		
		System.out.println("----------Before Sorting-------------");
		System.out.println(personList);
		
		Collections.sort(personList, new SortByName());
		
		System.out.println("----------After Sorting with respect to name--------------");
		System.out.println(personList);
		
		Collections.sort(personList, new SortByCity());
		
		System.out.println("-----------After Sroting with respect to city--------------");
		System.out.println(personList);
	}
}
