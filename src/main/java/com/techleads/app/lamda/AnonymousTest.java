package com.techleads.app.lamda;

public class AnonymousTest {

	public static void main(String[] args) {

		Runnable rn = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child thread-1");
				}

			}
		};
		Thread t1 = new Thread(rn);

		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 10; i++) {
				System.out.println("child thread-2");
			}
		});

		t2.start();
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}

}
