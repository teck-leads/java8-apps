package com.techleads.app.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("cb","ab", "test", "java1");
		
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		};
		
		
		List<String> collect2 = list.stream().sorted((a, b)-> b.length()-a.length()).collect(Collectors.toList());
//		Collections.sort(list, comparator);
		System.out.println(collect2);
		
		System.exit(0);
		
		
		List<String> collect = list.stream().sorted((x, y)-> y.length()-x.length()).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		System.exit(0);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o2.length()>o1.length()) {
					return 1;
				}else if(o1.length()>o2.length()) {
					return -1;
				}
				return 0;
			}

			
			
		});
		
		System.out.println(list);

	}

}
