package com.practice.som.java8.flatMapVsmap;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		List<Customer> customers = CustomerDAO.getAllDetails();

		
		//List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail() ::: one to one mapping
		List<String> emails = customers.stream().map(c -> c.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		
		//customer -> customer.getPhoneNumbers()  ->> one to many mapping
		//print in List<List<>> format
		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);

		
		//List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
		//print as one List<> format by using .flatMap() 
		List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(phones);
	}

}
