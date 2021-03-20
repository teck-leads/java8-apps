package com.techleads.app.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {

	public static void main(String[] args) {
		
		
		
		List<Employee> emps=new ArrayList<>();
		
		loadEmps(emps);
		System.out.println("before increment salary");
		emps.forEach(System.out::println);
		
		
		Predicate<Employee> lt40k=(emp)->emp.getSalary()<40000;
		List<Employee> empIncrs=new ArrayList<>();
		
		
		Function<Employee, Employee> incre1k=(emp)->{
			 emp.setSalary(emp.getSalary()+1000d);
			 return emp;
		};
		
		for (Employee employee : emps) {
			if(lt40k.test(employee)) {
				empIncrs.add(incre1k.apply(employee));
			}
		}
		
		
		System.out.println("After increment salary");
		emps.forEach(System.out::println);

		System.out.println("Only increment salary emps");
		empIncrs.forEach(System.out::println);
		
		
		
		
		
		Function<List<Employee>, Double> totalSal=(empss)-> {
			double sum=0;
			for (Employee emp : empss) {
				sum +=emp.getSalary();
			}
			return sum;
		};
		System.out.println("Total salary "+totalSal.apply(emps));
		
		
		
		Function<String, Integer> length=(str)->str.length();
		Integer strLength = length.apply("madhav");
		System.out.println("length "+strLength);
		
		Function<Integer, Integer> square=(num)->num*num;
		System.out.println(square.apply(5));
		
		Function<String, String> removeSpace=(str)->str.replaceAll(" ", "");
		
		System.out.println(removeSpace.apply("madhav teja"));
		
		//String str="this statement contains spaces remove it";
		String str="this text contains spaces";
		
		Function<String, Integer> countSpace=(s)->{
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					count++;
				}
			}
			String[] split = s.split(" ");
//			return split.length-1;
			return s.length()-s.replaceAll(" ", "").length();
			
		};
		Integer apply = countSpace.apply(str);
		System.out.println("cpace count "+apply);
		
		Function<Student, String> grade=(stu)->{
			int marks=stu.getMarks();
			if(marks>80)
				return "A[distinction]";
			else if(marks>=60)
				return "B[First class]";
			else if(marks>=50)
				return "C[Second class]";
			else if(marks>=35)
				return "D[Third class]";
			else
			return "E[Failed]";
			
		};
		
		System.out.println("\nStudent grades");
		List<Student> students=new ArrayList<>();
		populate(students);
		for (Student stu : students) {
			System.out.println(stu.getName()+" "+stu.getMarks()+" "+grade.apply(stu));
		}
		
	Predicate<Student> gt60Marks=(st)->st.getMarks()>60;
	
	System.out.println("\nStudent marks greater than 60");
	
	for (Student stu : students) {
		if(gt60Marks.test(stu))
		System.out.println(stu.getName()+" "+stu.getMarks()+" "+grade.apply(stu));
	}
	
		
	}

	private static void loadEmps(List<Employee> emps) {
		emps.add(new Employee(101, "madhav", 25000d));
		emps.add(new Employee(102, "dill", 5000d));
		emps.add(new Employee(103, "krishna", 35000d));
		emps.add(new Employee(104, "chari", 40000d));
		emps.add(new Employee(104, "chari2", 50000d));
	}
	
	public static void populate(List<Student> students) {
		students.add(new Student("madhav",55));
		students.add(new Student("dill",100));
		students.add(new Student("dhatri",65));
		students.add(new Student("Druv",45));
		students.add(new Student("kesav",25));
		
	}

}
