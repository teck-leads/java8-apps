package com.techleads.app.sorting;

import java.util.*;
import java.util.Map.*;

public class SortByVal {

	public static void main(String[] args) {
		boolean order = false;
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("B", 55);
		unsortMap.put("A", 80);
		unsortMap.put("D", 56);
		unsortMap.put("C", 62);
		Map<String, Integer> sortedMap = sortValues(unsortMap, order);
		for(Entry<String, Integer> entry: sortedMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

	public static Map<String, Integer> sortValues(Map<String, Integer> unsortMap, boolean order) {

		List<Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (order) {
					return o1.getValue().compareTo(o2.getValue());
				} else {

					return o2.getValue().compareTo(o1.getValue());
				}
			}

		});
		Map<String, Integer> sorted = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sorted.put(entry.getKey(), entry.getValue());
		}

		return sorted;

	}

}
