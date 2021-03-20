package com.techleads.app.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {

	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		
		System.out.println(list);
		
		
		Comparator<Integer> cmp = (i1, i2) -> {

			if (i1 > i2) {
				return -1;
			} else if (i1 < i2) {
				return 1;
			}
			return 0;

			// return (i1>i2)?-1:(i1<i2)?1:0;
		};
		
		
		MyComparator mc=new MyComparator();
//		Collections.sort(list,mc);
//		Collections.sort(list,cmp);
//		Collections.sort(list,(i1, i2) ->{return (i1>i2)?-1:(i1<i2)?1:0;});
		Collections.sort(list,(i1, i2) -> (i1>i2)?-1:(i1<i2)?1:0);
		//Collections.reverse(list);
		
		System.out.println(list);
	}
	
}
