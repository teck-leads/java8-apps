package com.techleads.app.lamda;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		
		
		Consumer<Movie> c1=(m1)->System.out.println("Movie "+m1.getName()+" is going to release");
		Consumer<Movie> c2=(m2)->System.out.println("Movie "+m2.getName()+" is "+m2.getResult());
		Consumer<Movie> c3=(m3)->System.out.println("Movie "+m3.getName()+" information is stored in db");
		Consumer<Movie> chainedConsu=c1.andThen(c2).andThen(c3);
		Movie m=new Movie("Rail", "Hit");
		chainedConsu.accept(m);
		
		Movie m1=new Movie("Jaanu", "Hit");
		chainedConsu.accept(m1);
	}
}
