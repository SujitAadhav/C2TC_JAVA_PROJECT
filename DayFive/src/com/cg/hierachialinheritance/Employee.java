package com.cg.hierachialinheritance;

public class Employee extends Person{
	private int employeeId;
	private float salary;
	private String designation;
	
	public Employee(String name, String gender, long phoneNo, String city, int employeeId, float salary,
			String designation) {
		super(name, gender, phoneNo, city);
		this.employeeId = employeeId;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", designation=" + designation
				+ ", getEmployeeId()=" + getEmployeeId() + ", getSalary()=" + getSalary() + ", getDesignation()="
				+ getDesignation() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getPhoneNo()="
				+ getPhoneNo() + ", getCity()=" + getCity() + "]";
	}
	
	
	
	
}
