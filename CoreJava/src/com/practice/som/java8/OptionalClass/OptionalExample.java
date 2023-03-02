package com.practice.som.java8.OptionalClass;

import java.util.Arrays;
import java.util.Optional;

import com.practice.som.java8.mapVsflatMap.Customer;

public class OptionalExample {

	public static void main(String[] args) {
		
		
		//Customer customer = new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725"));
		Customer customer = new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));
		
		//Implementation of static methods of Optional class
		//empty, of, ofNullable
		
		Optional<Object> emptyOptional= Optional.empty();		//Returns empty object
		System.out.println(emptyOptional);
		
		/*Optional<String> emailNull = Optional.of(customer.getEmail());     //Returns NullPointerException if there is null value
		System.out.println(emailNull);
		*/
		
		Optional<String> emailNotNull = Optional.ofNullable(customer.getEmail());	//Returns empty object if there is null value
		System.out.println(emailNotNull);

	}

}
