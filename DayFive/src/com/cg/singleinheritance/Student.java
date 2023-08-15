package com.cg.singleinheritance;

public class Student extends Citizen{
	private int id;
	private String collegeName;
	
	public Student() {
		super();
	}

	public Student(String name, String dateOfBirth, String address, String aadharNo, long phoneNo, int id, String collegeName) {
		super(name, dateOfBirth, address, aadharNo, phoneNo);
		this.id = id;
		this.collegeName = collegeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", collegeName=" + collegeName + ", getId()=" + getId() + ", getCollegeName()="
				+ getCollegeName() + ", getName()=" + getName() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getAddress()=" + getAddress() + ", getAadharNo()=" + getAadharNo() + ", getPhoneNo()="
				+ getPhoneNo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	


	
	
	
	
	
	
}
