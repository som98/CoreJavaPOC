package com.practice.som.java8.reduceFunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReduceFunctioninStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(4,6,89,9,23,1,12,56);
		
		int sum = addListFunctional(list);
		
		System.out.println(sum);
		
		findMax(list);
		
		findMin(list);
		
		/*
		 * int min = Collections.min(list); System.out.println(min);
		 */
	}
	
	//w.r.t. to code of line - 34
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

	private static void findMax(List<Integer> list) {
		
		int max= list.stream().reduce(Integer.MIN_VALUE, (a,b)-> a>b? a:b);
		System.out.println("Max Value: "+max);
		
		//OR - by using Method reference
		/*int max1 = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("Max Value: "+max1);
	    */
	}
	

	private static void findMin(List<Integer> list) {
		int min= list.stream().reduce(Integer.MAX_VALUE, (a,b)-> a>b? b:a);
		System.out.println("Min Value: "+min);
		
		//OR - by using Method reference
		/*int min1 = list.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("Max Value: "+min1);
		*/
		
		
	}
	

}
