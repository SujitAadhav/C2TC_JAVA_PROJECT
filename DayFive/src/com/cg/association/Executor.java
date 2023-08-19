package com.cg.association;

public class Executor {

	public static void main(String[] args) {
		
		Address a1 = new Address(1, "Bambrud (Raniche)", "Jalgaon", "Maharashtra", 453234);
		Person p1 = new Person("Sujit", a1, "B70");
		
//		Person p1 = new Person("Sujit", new Address(1, "Bambrud (Raniche)", "Jalgaon", "Maharashtra", 234543));
		
		p1.display();
	}

}
