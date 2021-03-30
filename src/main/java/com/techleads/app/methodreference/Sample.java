package com.techleads.app.methodreference;

interface interf2{
	public Sample get();
}

public class Sample {

	public Sample() {
		System.out.println("this is Sampel() 0 arg constructor");
	}

	public static void main(String[] args) {
		interf2 i=Sample::new;
		i.get();
		
		System.out.println("============");
		i=()->{
			System.out.println("this is my Sampple lambda implementation");
			return new Sample();
		};
		i.get();
	}
	
}
