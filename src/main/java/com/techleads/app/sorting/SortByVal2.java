package com.techleads.app.sorting;

import java.util.*;
import java.util.Map.*;

public class SortByVal2 {

	public static void main(String[] args) {
		boolean order = false;
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("B", 55);
		unsortMap.put("A", 80);
		unsortMap.put("D", 56);
		unsortMap.put("C", 62);

		Set<Entry<String, Integer>> entrySet = unsortMap.entrySet();

		List<Entry<String, Integer>> list = new LinkedList<>(entrySet);

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

//				return o2.getValue().compareTo(o1.getValue());
				return o2.getKey().compareTo(o1.getKey());
			}

		});

		Map<String, Integer> sorted = new LinkedHashMap<String, Integer>();

		for (Entry<String, Integer> entry : list) {
			sorted.put(entry.getKey(), entry.getValue());
		}
		
		sorted.forEach((k,v)->{
			System.out.println(k+" "+v);
		});

	}

}
