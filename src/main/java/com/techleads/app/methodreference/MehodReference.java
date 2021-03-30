package com.techleads.app.methodreference;


interface interf{
	
	public  void m1();
}
public class MehodReference {
	
	public static void main(String[] args) {
		
		interf interf=()->{
			System.out.println("M1 method");
		};
		
		
		interf.m1();
	}

}
