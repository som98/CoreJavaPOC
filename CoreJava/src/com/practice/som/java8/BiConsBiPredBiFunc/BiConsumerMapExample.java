package com.practice.som.java8.BiConsBiPredBiFunc;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//Real Time Example of BiConsumer is actually for Map
public class BiConsumerMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Som", 5000);
		map.put("Sam", 7000);
		map.put("Raju", 12000);
		
		// Using Anonymous class approach
		BiConsumer<String, Integer> biCons1 = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String i1, Integer i2) {

				System.out.println(i1 + " : " + i2);

			}
		};
		map.forEach(biCons1);
		
		
		
		// Using Lambda Function approach
		BiConsumer<String, Integer> biCons2=  (i1, i2) -> System.out.println("Key : " +i1 + " , Value : " + i2);
		
		map.forEach(biCons2);

	}

}
