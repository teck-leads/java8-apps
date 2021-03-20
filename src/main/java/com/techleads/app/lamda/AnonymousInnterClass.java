package com.techleads.app.lamda;

interface Interf{
	public void m1();
}


public class AnonymousInnterClass {
	int x=8888;
	int y=78;
	
	
	public void m2() {
		Interf inf=new Interf() {
			int x=9999;
			@Override
			public void m1() {
				System.out.println(this.x);
			}
		};
		inf.m1();
	}
	
	public void m3() {
		int x1=40;
		Interf inf=()->{
			int x=7777;
			
			System.out.println(y+" "+this.x+" "+x+" "+x1);
		};
		inf.m1();
	}

	public static void main(String[] args) {
		
		AnonymousInnterClass ani=new AnonymousInnterClass();
		ani.m2();
		System.out.println("==============");
		ani.m3();
	}

}
