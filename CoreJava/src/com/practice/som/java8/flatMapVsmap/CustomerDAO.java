package com.practice.som.java8.flatMapVsmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDAO {
	
	public static List<Customer> getAllDetails(){
		
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")));
		list.add(new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")));
		list.add(new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")));
		list.add(new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467")));
		
		return list;
		
		
		//Alternative way to add Array of objects into a list and return
		 /*return Stream.of(
	                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
	                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
	                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
	                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
	        ).collect(Collectors.toList());
	        */	
		
	}

}
