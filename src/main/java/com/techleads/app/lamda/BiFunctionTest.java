package com.techleads.app.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> prod=(n1, n2)->n1*n2;
		
		System.out.println(prod.apply(15, 45));
		
		
		
		
		//===========================
		BiFunction<String, Integer, Student> student=(name, rollNum)-> new Student(name, rollNum);
		List<Student> students=new ArrayList<>();
		students.add(student.apply("madhav", 102));
		students.add(student.apply("teja", 103));
		students.add(student.apply("dill", 104));
		students.forEach(System.out::println);
		//===========================
		Employee e=new Employee();
		e.setId(101);
		e.setName("Madhav");
		e.setDailyWage(250d);
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("teja");
		e1.setDailyWage(500d);
		TimeSheet t1=new TimeSheet();
		t1.setEmpNo(101);
		t1.setNumOfDays(30);
		
		BiFunction<Employee, TimeSheet, Double> monthlySal=(emp, tim)->emp.getDailyWage()*tim.getNumOfDays();
		
		
		System.out.println("Monthly salary "+monthlySal.apply(e1, t1));
		
		
		
	}

}
