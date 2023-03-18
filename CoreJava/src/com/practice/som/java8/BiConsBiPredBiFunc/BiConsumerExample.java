package com.practice.som.java8.BiConsBiPredBiFunc;

import java.util.function.BiConsumer;

//Traditional approach by implementing the interface
public class BiConsumerExample implements BiConsumer<String, Integer> {

	@Override
	public void accept(String i1, Integer i2) {

		System.out.println("Input1 : " + i1 + " , Input2 : " + i2);

	}

	public static void main(String[] args) {

		// Traditional approach
		BiConsumer<String, Integer> biCons1 = new BiConsumerExample();
		biCons1.accept("Java", 8);

		// Using Anonymous class approach
		// Other than Traditional approach - Class is not required to implement the BiFunction interface
		BiConsumer<String, Integer> biCons2 = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String i1, Integer i2) {

				System.out.println(i1 + " : " + i2);

			}
		};
		biCons2.accept("Welcome", 300);
		
		
		// Using Lambda Function approach
		// Other than Traditional approach - Class is not required to implement the BiFunction interface
		BiConsumer<String, Integer> biCons3=  (i1, i2) -> System.out.println("Key : " +i1 + " , Value : " + i2);
		biCons3.accept("Som", 798);
		
	}

}
