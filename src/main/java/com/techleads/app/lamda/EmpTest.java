package com.techleads.app.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpTest {

	public static void main(String[] args) {
		Employee e3=new Employee(103,"teja", 18000D);
		Employee e1=new Employee(101,"madhav", 15000D);
		
		Employee e2=new Employee(102,"dill", 20000D);
		
		Comparator<Employee> cm=(ee1, ee2)->{
			return (ee1.getId()>ee2.getId())?-1:(ee1.getId()<ee2.getId())?1:0;
		};
		List<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		System.out.println(emps);
		
		Collections.sort(emps,cm);
		
		System.out.println(emps);
		
		
		

	}

}
