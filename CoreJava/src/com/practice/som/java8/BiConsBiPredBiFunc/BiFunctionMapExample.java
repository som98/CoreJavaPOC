package com.practice.som.java8.BiConsBiPredBiFunc;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Som", 5000);
		map.put("Sam", 7000);
		map.put("Raju", 12000);

		// Traditional approach
		/*BiFunction<String, Integer, Integer> increasedbf = new BiFunction<String, Integer, Integer>() {

			@Override
			public Integer apply(String key, Integer value) {

				return value + 1000;
			}
		};

		 map.replaceAll(increasedbf);
		*/
		
		// Lambda approach
		// BiFunction<String, Integer, Integer> increasedbf_lambda = (key, value) -> value + 1000;
		// map.replaceAll(increasedbf_lambda);
		
		
		// Simplest approach
		map.replaceAll((key, value) -> value + 1000);
		System.out.println(map);

	}

}
