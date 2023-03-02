package com.practice.som.java8.OptionalClass;

import java.util.Optional;

public class Optional_DemoBasics2 {

	public static void main(String[] args) {
		String words[] = new String[10];
		words[5] = "Hello Som";
		Optional<String> checkWords = Optional.ofNullable(words[5]);

		checkWords.ifPresent(t -> System.out.println(t));
		// Alternative way to print
		checkWords.ifPresent(System.out::println);	// printing value by using method reference
		System.out.println(checkWords.get());		// printing value by using get method 
		System.out.println(words[5].toLowerCase());
	}

}
