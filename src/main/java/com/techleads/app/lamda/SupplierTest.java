package com.techleads.app.lamda;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
	///////////////////////
	Supplier<Date> s=()->new Date();
	
	Date date = s.get();
	System.out.println(date);
//	String[] str= {"madhav", "teja", "dill", "druvin", "dhatri"};
	
	String[] str= {"madhav","dill","druvin"};
	
	///////////////////
	
	//   0 =< Math.random() < 1
	Supplier<String> random=()->{
		int len=str.length;
		if(len>0) {
			int ind=(int)(Math.random()*(len));
			return str[ind];
		}
		return "";
		
	};
	
	for(int i=0;i<100;i++) {
		System.out.println(random.get());
	}
	
////////////generate OTP//////
	
	
	Supplier<String> otp=()->{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<6;i++) {
			int x=(int)(Math.random()*10);
			sb.append(x);
		}
		return sb.toString();
	};
	
	for(int i=0;i<20;i++) {
		System.out.println("Generated OTP "+otp.get());
	}
	
	System.out.println("===================");
	
	// A2B4C6D8
	String alphaSpecial="ABCDEFGHIJKLMNOPQRSTUVWXYZ#@!";
	//Generate random password with 8 characters
	Supplier<String> pwd = () -> {
		StringBuilder sb = new StringBuilder();
		Supplier<Integer> digits = () -> (int) (Math.random() * 10);
		for (int i = 1; i <= 8; i++) {
			if (i % 2 == 0) {
				sb.append(digits.get());
			} else {
				char charAt = alphaSpecial.charAt((int) (Math.random() * alphaSpecial.length()));
				sb.append(charAt);
			}
		}
		;

		return sb.toString();
	};
	int i=0;
	while (i!=20) {
		System.out.println("password: " + pwd.get());
		i++;
	}
	
	}

	
	
	
	
	

	

	
}
