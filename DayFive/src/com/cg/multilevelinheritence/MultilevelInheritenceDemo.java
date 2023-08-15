package com.cg.multilevelinheritence;

public class MultilevelInheritenceDemo {

	public static void main(String[] args) {
		City c = new City();
		c.setCountryName("India");
		c.setCapital("Delhi");
		c.setStateName("Maharashtra");
		c.setLocation("Near Gujrat");
		c.setLanguage("Marathi");
		c.setCityName("Jalgaon");
		c.setPincode(420001);
		System.out.println(c);
	}

}
