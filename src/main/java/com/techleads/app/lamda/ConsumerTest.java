
package com.techleads.app.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<String> con=s->System.out.println(s);
		
		con.accept("Hello");
		con.accept("test");
		/////////////////////
		Consumer<Movie> m1 = (m) -> {
			System.out.println(m.getName() + " | " + m.getDirector() + " | " + m.getProducer());
		};

		List<Movie> movies = new ArrayList<>();
		Movie.loadMovies(movies);
		for (Movie m : movies) {
			m1.accept(m);
		}
/////////////////////
		
		Predicate<Student> gte60Marks=(st)->st.getMarks()>=60;
		
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
		
		Consumer<Student>  display=(stu)->{
			System.out.println(stu.getName()+" "+stu.getMarks()+" "+grade.apply(stu));
		};
		
		List<Student> students=new ArrayList<>();
		
		Student.populateStudents(students);
		System.out.println("\n\nStudent details who are more than 60 marks");
		for (Student student : students) {
			
			if(gte60Marks.test(student)) {
				display.accept(student);
			}
			
		}
		
		
	}

}

