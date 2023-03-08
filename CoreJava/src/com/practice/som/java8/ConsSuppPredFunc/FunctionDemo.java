package com.practice.som.java8.ConsSuppPredFunc;

import java.util.List;
import java.util.function.Function;

//Using traditional way of implementing Function Functional Interface
/*public class FunctionDemo implements Function<Integer, Integer>{
	
	@Override
	public Integer apply(Integer t) {
		return t*t;
	}
*/

public class FunctionDemo{

	public static void main(String[] args) {
		
		/*FunctionDemo f = new FunctionDemo();
		System.out.println(f.apply(6)); */
		
		List<Integer> numbers = List.of(6,4,7,9,2,1,3);
		
		//Traditional way to declare a Function object in a class
		/*Function<Integer,Integer> squared1= new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		
		numbers.stream().filter(t->t%2==0).map(squared1).forEach(System.out::println);
		*/
		
		//Creating a Function object by using lambda function
		/*Function<Integer,Integer> squared2 = t->t*t;
		numbers.stream().filter(t->t%2==0).map(squared2).forEach(System.out::println);
		*/
			
		
		//Simplified way to use a Function in map
		numbers.stream().filter(t->t%2==0).map(t->t*t).forEach(System.out::println);
		

	}

	
}
