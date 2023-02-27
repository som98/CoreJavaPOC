package com.practice.som.collections.Map;

import java.util.*;

class MapExample {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Amit");
		map.put(105, "Vijay");
		map.put(100, "Rahul");
		map.put(102, "Som");
		map.put(104, "Tanishq");
		map.put(103, "Rishav");
		
		System.out.println(map);
		System.out.println(map.entrySet());
		
		// Elements can traverse in any order
		System.out.println("Elements:");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Sorting in ascending order as per Key
		System.out.println("Sorting in ascending order as per Key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		// Sorting in descending order as per Key
		System.out.println("Sorting in descending order as per Key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		// Sorting in ascending order as per Value
		System.out.println("Sorting in ascending order as per Value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		// Sorting in descending order as per Value
		System.out.println("Sorting in descending order as per Value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);
	}
}
