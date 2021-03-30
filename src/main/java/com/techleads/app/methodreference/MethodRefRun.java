package com.techleads.app.methodreference;

public class MethodRefRun {
	
	
	public void myRun() {
		for(int i=0;i<10;i++) {
			System.out.println(i+" my thread ");
		}
	}
	

	public static void main(String[] args) {
		
		MethodRefRun mr=new MethodRefRun();
		Runnable run=mr::myRun;
		
		Thread t1=new Thread(run);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println(i+" my main thread ");
		}
		
		
	}

}
