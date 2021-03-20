package com.techleads.app.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmpMgmtTest {

	public static void main(String[] args) {
		
		List<Employee> emps =new ArrayList<>();
		emps.add(new Employee("madhav", "Devloper", "Hyderabad", 25000d));
		emps.add(new Employee("dill", "Architect", "USA", 50000d));
		emps.add(new Employee("teja", "DB Admin", "Hyderabad", 30000d));
		emps.add(new Employee("raj", "Devloper", "Chennai", 29000d));
		emps.add(new Employee("Sridar", "Manager", "Bangalore", 29000d));
		emps.add(new Employee("Krishna", "Manager", "Mumbai", 29000d));
		
		emps.forEach(System.out::println);
		
		Predicate<Employee> designation =(emp)->emp.getDesignation().equalsIgnoreCase("Manager");
		System.out.println("\nEmployees whose DESG is manager");
		display(designation, emps);
		
		Predicate<Employee> lcation =(emp)->emp.getCity().equalsIgnoreCase("Bangalore");
		System.out.println("\nEmployees whose loction is Bangalore");
		display(lcation, emps);
		
		Predicate<Employee> salaryLt30k =(emp)->emp.getSalary()<30000;
		System.out.println("\nEmployees whose Salary is less than 30K");
		display(salaryLt30k, emps);
		
		
		System.out.println("\nAll managers from Bangalore");
		display(designation.and(lcation), emps);
		
		System.out.println("\nAll managers or whose salary is less than 30k");
		display(designation.or(salaryLt30k), emps);
		
		Predicate<Employee> notMgrs =(emp)->emp.getDesignation().equalsIgnoreCase("Manager");
		System.out.println("\nEmployees whose DESG is not mgrs");
		display(designation.negate(), emps); 
		
		Predicate<Employee> isCEO=Predicate.isEqual(new Employee("madhav", "CEO", "Hyderabad", 25000d));
		Employee e1 = new Employee("madhav", "CEO", "Hyderabad", 25000d);
		Employee e2 = new Employee("dill", "CEO", "Hyderabad", 25000d);
		
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
		
		
		
		
		Predicate<String> p = Predicate.isEqual("test1231");
		System.out.println(p.test("test1231"));
		

	}
	
	public static void display(Predicate<Employee> pred, List<Employee> emps) {
		for (Employee employee : emps) {
			if(pred.test(employee)) {
				System.out.println(employee);
			}
		}
		System.out.println("**************************");
	}

}
