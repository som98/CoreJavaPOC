package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile_DropWhileExample {

	public static void main(String[] args) {

		List<Course> course = CourseDAO.getAlldetails();

		System.out.println(course.stream()
				.collect(Collectors.toList()));
		 /* <O/P>-> [Spring:Framework:98:20000, Spring Boot:Framework:95:18000, API:Microservices:97:22000, 
		  * Microservices:Microservices:96:25000, FullStack:FullStack:91:14000, AWS:Cloud:92:21000, 
		  * Azure:Cloud:99:21000, Docker:Cloud:92:20000, Kubernetes:Cloud:91:20000] */
		
		// takeWhile(Predicate T) - Will capture the items that matches the criteria
		System.out.println(course.stream()
				.takeWhile(c-> c.getReviewScore()>=95)
				.collect(Collectors.toList()));
		/* <O/P>-> [Spring:Framework:98:20000, Spring Boot:Framework:95:18000, API:Microservices:97:22000, 
		 * Microservices:Microservices:96:25000]*/

		
		// dropWhile(Predicate T) - Will capture the items that doest not match the criteria
		System.out.println(course.stream()
				.dropWhile(c-> c.getReviewScore()>=95)
				.collect(Collectors.toList()));
		/*[FullStack:FullStack:91:14000, AWS:Cloud:92:21000, Azure:Cloud:99:21000, Docker:Cloud:92:20000, 
		 * Kubernetes:Cloud:91:20000]*/
		
	}

}
