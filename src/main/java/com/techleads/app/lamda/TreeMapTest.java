package com.techleads.app.lamda;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		MyComparator mc=new MyComparator();
//		Map<Integer,String> tm=new TreeMap<>(mc);
		
		Map<Integer,String> tm=new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		tm.put(2, "two");
		tm.put(4, "four");
		tm.put(5, "five");
		tm.put(1, "one");
		
		tm.put(3, "three");
		
		tm.put(6, "six");
		System.out.println(tm);
		
		
	}

}
