package com.techleads.app.methodreference;


interface interf1{
	
	public  void m1();
}
public class MethodRefSol {

	
	public static void m2() {
		System.out.println("m2() implementation by method reference");
	}
	
	public void m0() {
		System.out.println("m0() implementation by method reference");
	}
	public static void main(String[] args) {
		//only one restriction is m1 and m2 should have same argument types 
		//and remaining can be anything
		interf1 inter=MethodRefSol::m2;
		inter.m1();
		
	//anyone calls m1 method then m1 method refers to m2 method
		//it is like giving reference to a person to get job for him
		//method reference is alternate syntax to lambda expression
		
		//functional interface can refers to lambda expression and method reference
		
		/*
		 static for method reference
			static:
				className::methodName

		 Instance:
			ObjectReference::methodName

		Test t=new Test();	
			t::m2

		 */
		MethodRefSol ms=new MethodRefSol();
	
		inter=ms::m0;
		inter.m1();
		
	}

}
