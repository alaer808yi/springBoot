package com;

import java.util.Arrays;
import java.util.Comparator;

import com.model.Person;
import com.model.Student;



public class TestDemo extends FactoryDemo {
	
	private volatile int a;
	private int b;
	private int c;

	public static void main(String args[]) throws CloneNotSupportedException{
		Person person = new Person("hello",12);
		Person person2 = new Person("world", 234);
		Person person3 = new Person("world", 23234);
		Person[] persons = new Person[]{person,person2,person3};
		Arrays.sort(persons);
		for(int i=0;i<persons.length;i++){
			System.out.println(persons[i].getAge()+"--"+persons[i].getName());
		}
		
		
		Student student = new Student("zello",12,"");
		Student student2 = new Student("sadf", 234,"");
		Student student3 = new Student("world", 23234,"");
		
		Student[] students = new Student[]{student,student2,student3};
		Arrays.sort(students);
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].getAge()+"--"+students[i].getName());
		}
		
	}
	

	@Override
	void say() {
		// TODO Auto-generated method stub
		
	}
	Comparator g = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	Comparable f = new Comparable() {

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	
	
	
	
	
	
	

}
