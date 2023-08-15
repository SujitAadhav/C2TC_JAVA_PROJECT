package com.cg.hierachialinheritance;

public class HierachialInheritanceDemo {

	public static void main(String[] args) {
		Student s1 = new Student("Sujit", "Male", 8765456543L, "Jalgaon", "DKSDC", 9.34f);
		Employee e1 = new Employee("Sujit", "Male", 8765456543L, "Jalgaon", 1, 300000.476F, "Full Stack Developer");
		System.out.println(s1);
		System.out.println(e1);
	}

}
