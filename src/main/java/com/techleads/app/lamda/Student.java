package com.techleads.app.lamda;

import java.util.List;

public class Student {

	private String name;
	private Integer marks;
	public Student(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	public static void populateStudents(List<Student> students) {
		students.add(new Student("madhav",55));
		students.add(new Student("dill",100));
		students.add(new Student("dhatri",65));
		students.add(new Student("Druv",45));
		students.add(new Student("kesav",25));
		
	}
}
