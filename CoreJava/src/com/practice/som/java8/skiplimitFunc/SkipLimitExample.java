package com.practice.som.java8.skiplimitFunc;

import java.util.List;

public class SkipLimitExample {

	public static void main(String[] args) {

		List<Integer> list = List.of(2, 3, 7, 9, 12, 18, 25, 29, 34, 39, 45, 50, 56, 59);

		// skip(n) function will skip the first n elements.
		// limit(n) function will take the nth element as the last element
		// If used skip(s) and length(l) function together then the last lth element
		// will be taken after omitting the first s elements
		list.stream().skip(3).limit(9).forEach(t -> System.out.print(t + " "));

	}

}
