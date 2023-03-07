package com.practice.som.java8.reduceFunction;

import java.util.List;

public class ReduceFunctionExercise {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

		int sumOfsquares = SumofSquares(list);

		System.out.println("Sum of squares of numbers : " + sumOfsquares);

		int sumOfodd = SumOfOdd(list);
		
		System.out.println("Sum of odd numbers : " + sumOfodd);

	}

	private static int SumofSquares(List<Integer> list) {

		return list.stream().map(c -> c * c).reduce(0, (a, b) -> (a + b));
	}

	private static int SumOfOdd(List<Integer> list) {

		return list.stream().filter(n->n%2!=0).reduce(0, (a, b) -> (a + b) );
	}

}
