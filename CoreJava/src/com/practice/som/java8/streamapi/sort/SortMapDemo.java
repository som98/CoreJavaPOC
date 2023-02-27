package com.practice.som.java8.streamapi.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		List<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

		// Traditional way to sort Map having both Key and Value as Primitive Datatype -
		// 1
		/*
		 * Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {
		 * 
		 * @Override public int compare(Entry<String, Integer> o1, Entry<String,Integer>
		 * o2) {
		 * 
		 * return o1.getKey().compareTo(o2.getKey()); } });
		 */

		// Using Lambda Expression to sort Map having both Key and Value as Primitive
		// Data type - 2

		Collections.sort(entryList, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		for (Map.Entry m : entryList) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Other way to print using For Loop
		/*
		 * for(Entry<String, Integer> e : entryList) {
		 * System.out.println(e.getKey()+" "+e.getValue()); }
		 */

		// Using Stream API to sort and print the Map w.r.t Key having both Key and
		// Value as Primitive Data type (ascending order) - 3
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		// Using Stream API to sort and print the Map w.r.t. Value having both Key and
		// Value as Primitive Data type (ascending order) -3
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}

}
