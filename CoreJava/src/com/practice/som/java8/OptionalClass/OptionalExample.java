package com.practice.som.java8.OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.practice.som.java8.flatMapVsmap.Customer;
import com.practice.som.java8.flatMapVsmap.CustomerDAO;

public class OptionalExample {

	public static Customer getCustomerByEmailID(String email) throws Exception {

		List<Customer> customer = CustomerDAO.getAllDetails();

		return customer.stream().filter(c -> c.getEmail().equals(email)).findAny()
				.orElseThrow(() -> new Exception("No EmailId present"));

	}

	public static void main(String[] args) throws Exception {

		Customer customer1 = new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725"));
		Customer customer2 = new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));

		// Implementation of static methods of Optional class
		// empty, of, ofNullable

		Optional<Object> emptyOptional = Optional.empty(); // Returns empty object
		System.out.println(emptyOptional);

		/*
		 * Optional<String> emailNull = Optional.of(customer2.getEmail()); //Returns
		 * NullPointerException if there is null value System.out.println(emailNull);
		 */

		Optional<String> emailNotNull = Optional.ofNullable(customer2.getEmail()); // Returns empty object if there is
																					// null value
		System.out.println(emailNotNull);

		if (emailNotNull.isPresent()) {
			System.out.println(emailNotNull.get());
		}

		System.out.println(emailNotNull.orElse("chris@gmail.com")); // or Else method to display other string

		//System.out.println(emailNotNull.orElseThrow(() -> new IllegalArgumentException("Email not present"))); // To
																												// throw
																												// custom
																												// exception
		
		//Using stream API for Class's object filtering
		
		//System.out.println(getCustomerByEmailID("abc"));
		System.out.println(getCustomerByEmailID("john@gmail.com"));
	}

}
