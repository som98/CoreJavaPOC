package com.practice.som.java8.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {


		long start = 0;
		long end = 0;
		long plainStream = 0;
		long parallelStream = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(System.out::println);
		end = System.currentTimeMillis();
		plainStream = end - start;

		System.out.println("===========================================================");
		
		start = System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		parallelStream = end - start;
		
		System.out.println("Plain stream took time : "+ plainStream);
		System.out.println("Parallel stream took time : "+ parallelStream);

	}

}
