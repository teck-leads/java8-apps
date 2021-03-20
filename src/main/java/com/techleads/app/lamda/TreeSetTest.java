package com.techleads.app.lamda;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		MyComparator mc=new MyComparator();
		
//		Set<Integer> ts=new TreeSet<>(mc);
		
		Set<Integer> ts=new TreeSet<>((i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0);
		
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(5);
		ts.add(20);
		
		System.out.println(ts);

	}

}
