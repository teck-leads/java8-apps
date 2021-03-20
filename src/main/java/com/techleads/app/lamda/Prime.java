package com.techleads.app.lamda;

public class Prime {

	public static void main(String[] args) {

		for(int i=0;i<=21;i++) {
			boolean prime = isPrime(i);
			System.out.println(prime+" "+i);
		}

//		boolean prime = isPrime(13);
//		System.out.println(prime);

	}

	/*
	public static boolean isPrime(int num) {
		boolean flag = true;
		if (num <= 1 || (num != 2 && num % 2 == 0)) {
			return false;
		} else if (num == 2) {
			return true;
		} else {

			for (int i = 3; i <= Math.sqrt(num); i += 2) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}

			return flag;
		}

	}
	*/
	
	public static boolean isPrime(int num) {
		
		if (num <= 1 || (num != 2 && num % 2 == 0)) {
			return false;
		} else if (num == 2) {
			return true;
		} else {

			for (int i = 3; i <= Math.sqrt(num); i += 2) {
				if (num % i == 0) {
					return false;
				}
			}

			return true;
		}

	}


}
