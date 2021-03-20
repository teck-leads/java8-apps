package com.techleads.app.lamda;

import java.util.function.Function;

public class FunctionChaining {

	
	//f1.andThen(f2) f1 will be applied followed by f2
//	f1.compose(f2) f2 will be applied followed by f1
	
	public static void main(String[] args) {
		
		////////////////////////////////
		String text="madhavanupoju";
		Function<String, String> upperCase=(str)->str.toUpperCase();
		Function<String, String> first9Chars=(str)->str.substring(0, 9);
		System.out.println(upperCase.apply(text));
		System.out.println(first9Chars.apply(text));
		
		System.out.println(upperCase.andThen(first9Chars).apply(text));
		
		System.out.println(upperCase.compose(first9Chars).apply(text));
		
		
		////////////////////////////////
		Function<Integer, Integer> doubleValue=(num)->num+num;
		Function<Integer, Integer> cubeVal=(num)->num*num*num;
		System.out.println(doubleValue.apply(2));
		System.out.println(cubeVal.apply(2));
		
		System.out.println(doubleValue.andThen(cubeVal).apply(2));
		
		System.out.println(doubleValue.compose(cubeVal).apply(2));
		////////////////////////////////
		Function<String, String> lowerCase=(str)->str.toLowerCase();
		Function<String, String> first6Chars=(str)->str.substring(0, 6);
		
		String username="madhav anupoju";
		String pwd="admin";
		
		if(lowerCase.andThen(first6Chars).apply(username).equals("madhav")&& pwd.equals("admin")) {
			System.out.println("valid credentials");
		}else {
			System.out.println("invalid credentials");
		}
		
////////////////////////////////identity 
		Function<String, String> identity=Function.identity();
		String ident = identity.apply("Microservices");
		System.out.println(ident);
	
		
		
		
		
		
	}
	
	
	

}
