package com.model;

public class Student extends Person implements Comparable{
	private String school;
	
	public Student(String name, int age,String school) {
		super(name, age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public int compareTo(Object o) {
		return ((Student)o).getName().compareTo(super.getName())  ;
	}





}
