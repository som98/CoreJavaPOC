package com.practice.som.java8.extras;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveDataType {

	public static void main(String[] args) {

		// To display int (primitive data type) numbers from 1 to 9
		IntStream.range(1, 10).forEach(t -> System.out.print(t + " "));
		System.out.println();
		
		// To display int (primitive data type) numbers from 1 to 10
		IntStream.rangeClosed(1, 10).forEach(t -> System.out.print(t + " "));
		System.out.println();

		// To display the sum of int (primitive data type) numbers from 1 to 10
		System.out.println(IntStream.rangeClosed(1, 10).sum());

		// To iterate using the Unary Operator logic till the limit value.
		// peek() is for displaying one by one characters without disturbing the flow
		System.out.println(IntStream.iterate(1, e -> e + 2)
				.limit(10)
				.peek(t -> System.out.print(t + " "))
				.sum());

		// Since primitive data types cannot be directly converted into List so used boxed() function
		System.out.println(IntStream.iterate(2, e -> e * 2)
				.limit(10)
				.boxed()
				.collect(Collectors.toList()));

	}

}
