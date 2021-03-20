package com.techleads.app.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		
		
		MyUsers[] userList = {
				new MyUsers("madhav", 25000d, 25),
				new MyUsers("dill", 30000d, 28),
				new MyUsers("teja", 28000d, 26),
				new MyUsers("druvin", 23000d, 17),
				new MyUsers("sai", 20000d, 16),
				new MyUsers("raju", 24000d, 18)
				
		};
		
		Predicate<MyUsers> credApply=(user)->user.getSalary()>20000 && user.getAge()>=18;
		
		
		System.out.println("cred users");
		for (MyUsers user : userList) {
			if(credApply.test(user)) {
				System.out.println(user);
			}
		}
		System.out.println("cred users end");
		
		
		
		Predicate<MyUsers> isValid=(user)->user.getUsername().equals("madhav")&&user.getPwd().equals("admin");
		
		MyUsers user=new MyUsers("madhav", "admin");
				
		if(isValid.test(user)) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}
		
		
		
		String[] sAray = {null, "Kishore","madhav",null, "teja","", "kiranmai"};
		
		
		Predicate<String> removeNull=(str)->str!=null && str.length()>0;
		
		
		for (String name : sAray) {
			if(removeNull.test(name)) {
				System.out.print(name+" ");
			}
		}
		
		System.out.println();
		String[] sAry = {"kiran", "Kishore","madhav", "teja", "kiranmai"};
		Predicate<String> Sk=(str)->{
			
			return str.startsWith("k")||str.startsWith("K");
		};
		
		for (String name : sAry) {
			if(Sk.test(name)) {
				System.out.println(name);
			}
		}
		
		
		
		
		Predicate<Integer> isEven=(num)->{
			return (( num!=0) &&(num % 2 == 0) ) ? true : false;
		};
		
		
		
		Predicate<Integer> isPrime = (num) -> {
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

		};
		
		
		for(int i=0;i<=100;i++) {
			if(isPrime.test(i)) {
				System.out.println(i+" is prime number");
			}
		}
		
		
		
		Predicate<String> leng=(str)->{
			return str.length()>5?true:false;
		};
		
		Predicate<Collection> size=(sz)->sz.isEmpty();
		List<String> li=new ArrayList<>();
		
		Map<String, String> m=new HashMap<>();
		System.out.println("Size "+size.test(li));
		
		
		
		System.out.println("length "+leng.test("madhav"));
		
		System.out.println("length "+leng.test("abc"));
		
		boolean test = isEven.test(12);
		System.out.println(test);
		
		for(int i=0;i<=10;i++) {
			if(isEven.test(i)) {
				System.out.println(i);
			}
		}
		
	}

	public boolean test(Integer i) {

//		return (( i!=0) &&(i % 2 == 0) ) ? true : false;
		
		if(i!=0 && i%2==0) {
			return true;
		}
		return false;
	}

}
