package com.techleads.app.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerTest {

	public static void main(String[] args) {
		
		
		
		BiConsumer<String, String> biCon=(s1, s2)->System.out.println(s1.concat(s2));
		
		biCon.accept("madhav", "anupoju");
		
		
		
		BiFunction<String, Integer, Student> student=(name, marks)-> new Student(name, marks);
		
		
		Student s1 = student.apply("madhav", 45);
		Student s2 = student.apply("dill", 55);
		Student s3 = student.apply("teja", 50);
		Student s4 = student.apply("krishna", 52);
		
		List<Student> asList = Arrays.asList(s1, s2, s3, s4);
		
		BiConsumer<Student, Integer> incrMarksBy5=(stu, marks)->stu.setMarks(stu.getMarks()+marks);
		System.out.println("Before increment");
		asList.forEach(System.out::println);
		System.out.println("After increment");
		
		for(Student st: asList) {
			incrMarksBy5.accept(st, 5);
		}
		
		asList.forEach(System.out::println);
		
	}
}
