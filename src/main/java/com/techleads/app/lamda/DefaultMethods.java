package com.techleads.app.lamda;

interface Left{
	
	public void m1();
	
	default void m2() {
		System.out.println("this is default from Left");
	}
}

interface Right{
	
	public void m1();
	
	default void m2() {
		System.out.println("this is default from Right");
	}
}

interface Interf1{
	
	void add(int a, int b);
	
	default void mydefaultM1() {
		System.out.println("this is default method");
	}
	
	static int mult(int a, int b) {
		return a*b;
	}
}

public class DefaultMethods implements Interf1, Left, Right {
	

	public static void main(String[] args) {
		
		DefaultMethods df=new DefaultMethods();
		df.mydefaultM1();
		df.add(12, 34);
		System.out.println("multi "+Interf1.mult(2, 4));
		
		df.m1();
		df.m2();
		

	}

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	@Override
	public void mydefaultM1() {
		
		//Interf1.super.mydefaultM1();
		System.out.println("defalt method is overiden");
		System.out.println("multi "+Interf1.mult(2, 4));
	}

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		
		Left.super.m2();
		Right.super.m2();
	}
	{
		System.out.println("this is an instance block");
	}
	
}
