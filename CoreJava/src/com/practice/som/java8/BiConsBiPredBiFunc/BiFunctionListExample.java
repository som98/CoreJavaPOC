package com.practice.som.java8.BiConsBiPredBiFunc;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Traditional approach by implementing the interface
public class BiFunctionListExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {

		// Using stream and Lambda function to display the joint and distinct values of
																	// two Lists
		/* return Stream.of(list1,list2).flatMap(c->c.stream()).distinct().collect(Collectors.toList());*/

		// Using stream and Lambda function to display the joint and distinct values
											// of two Lists without collect() method
		/* return Stream.of(list1,list2).flatMap(c->c.stream()).distinct().toList(); */

		// Using stream and Method reference to display the joint and distinct values
											// of two Lists without collect() method
		return Stream.of(list1, list2).flatMap(List::stream).distinct().toList();
	}

	public static void main(String[] args) {

		List<Integer> l1 = Stream.of(1, 3, 6, 8, 11, 17, 30, 25, 5, 41).collect(Collectors.toList());
		List<Integer> l2 = Stream.of(1, 5, 6, 8, 13, 19, 25, 11, 41, 17).collect(Collectors.toList());

		// Traditional approach
		BiFunction biFunction1 = new BiFunctionListExample();
		System.out.println("Traditional approach: "+biFunction1.apply(l1, l2));

		// Using Anonymous class approach
		// Other than Traditional approach - Class is not required to implement the BiFunction interface
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = new BiFunction<List<Integer>, 
				List<Integer>, List<Integer>>() {

			@Override
			public List<Integer> apply(List<Integer> t, List<Integer> u) {
				return Stream.of(l1, l2).flatMap(List::stream).distinct().toList();

			}
		};

		System.out.println("Anonymous approach: "+biFunction2.apply(l1, l2));

		
		// Using Lambda Function approach
		// Other than Traditional approach - Class is not required to implement the BiFunction interface
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction3 = (t, u) -> Stream.of(l1, l2)
				.flatMap(List::stream).distinct().toList();
		
		System.out.println("Lambda approach: "+ biFunction3.apply(l1, l2));
		
	}

}