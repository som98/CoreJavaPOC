package com.practice.som.java8.reduceFunction;

import java.util.Arrays;
import java.util.List;

public class ReduceFunctioninStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,4,6,9,23,12,56,89);
		
		int sum = addListFunctional(list);
		
		System.out.println(sum);
	}
	
	//w.r.t. to code of line - 25
	/*
	public static int summation(int aggregrate, int nextnumber) {
		return aggregrate+nextnumber;
	} */

	private static int addListFunctional(List<Integer> list) {
		
		//By using method reference to return the sum value
		//return list.stream().reduce(0, ReduceFunctioninStream::summation);
		
		
		//Using lambda function for summation
		return list.stream().reduce(0, (aggregrate,nextnumber) -> aggregrate+nextnumber );
		
		//Using inbuilt sum function
		//return list.stream().reduce(0, Integer::sum);
	}

	
	

}
