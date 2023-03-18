package com.practice.som.java8.BiConsBiPredBiFunc;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		// Using Anonymous class approach
		BiPredicate<String, String> biPred1 = new BiPredicate<String, String>() {

			@Override
			public boolean test(String s1, String s2) {
				return s1.equalsIgnoreCase(s2); // Checking palindrome string or not
			}
		};
		System.out.println(biPred1.test("MADAM", "MADAM"));

		// Using Lambda Function approach
		BiPredicate<String, String> biPred2 = (s1, s2) -> s1.equalsIgnoreCase(s2);
		
		System.out.println("BiPredicate Palindrome via Lambda: "+ biPred2.test("MOM", "MOM"));
		
		BiPredicate<String, String> biPred3 = (s1,s2) -> s1.length() == s2.length();
		
		//Using and method
		System.out.println("Two BiPredicate (using and) Palindrome via Lambda: "+ 
				biPred2.and(biPred3).test("MOM", "MOM"));
		
	}

}
