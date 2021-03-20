package com.techleads.app.lamda;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		

		
		BiPredicate<Integer, Integer> sumIsEven = (n1, n2) -> {
			if ((n1 + n2) % 2 == 0) {
				return false;
			}
			return false;
		};
		System.out.println(sumIsEven.test(10, 21));
		
		
		BiPredicate<Integer, Integer> sumIsEven1 = (n1, n2) -> (n1+n2)%2==0;
		System.out.println(sumIsEven1.test(45, 12));
		
		
	}

}
