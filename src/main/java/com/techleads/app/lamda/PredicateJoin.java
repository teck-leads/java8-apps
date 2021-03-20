package com.techleads.app.lamda;

import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Predicate<Integer> gt9=(num)-> num>9; 
//		Predicate<Integer> even=(num)-> num%2==0; 

		Predicate<Integer> gt10 = (num) -> {
			return num > 10 ? true : false;
		};
		Predicate<Integer> even = (num) -> {
			return num>1&&num % 2 == 0 ? true : false;
		};
		int[] ar = { 0, 5, 10, 12,15, 20, 25, 30, 35 };

		System.out.println("numbers greater than 10 AND even numbers");
		for (int i = 0; i < ar.length; i++) {
			Predicate<Integer> evenANDGt10 = gt10.and(even);

			if (evenANDGt10.test(ar[i])) {
				System.out.print(ar[i] + " ");
			}

		}
		System.out.println("\nnumbers greater than 10 OR even numbers");

		for (int i = 0; i < ar.length; i++) {
			Predicate<Integer> evenORGt10 = gt10.or(even);

			if (evenORGt10.test(ar[i])) {
				System.out.print(ar[i] + " ");
			}
		}
		
		System.out.println("\nnumbers not greater than 10");

		for (int i = 0; i < ar.length; i++) {
			Predicate<Integer> nagateGt10= gt10.negate();

			if (nagateGt10.test(ar[i])) {
				System.out.print(ar[i] + " ");
			}
		}

	}

}
