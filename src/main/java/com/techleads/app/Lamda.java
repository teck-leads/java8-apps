package com.techleads.app;

public class Lamda {

	public static void main(String[] args) {
		Runnable rn=()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child thread "+i);
			}
		};
		
		Thread t1=new Thread(rn);
		t1.setName("child-1");
		t1.start();
		
	
		for(int i=0;i<10;i++) {
			System.out.println("main thread "+i);
		}

	}

}
