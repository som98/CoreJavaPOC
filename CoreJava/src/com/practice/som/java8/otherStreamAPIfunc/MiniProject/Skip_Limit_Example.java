package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Skip_Limit_Example {

	public static void main(String[] args) {

		List<Course> course = CourseDAO.getAlldetails();

		// Comparing w.r.t. one field and then another field 
		Comparator<Course> comparingByNoOfStudentsAndReviewScore = Comparator
				.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore);
		
		
		System.out.println(course.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.collect(Collectors.toList()));
		 /* <O/P>-> [FullStack:FullStack:91:14000, Spring Boot:Framework:95:18000, Kubernetes:Cloud:91:20000, 
		Docker:Cloud:92:20000, Spring:Framework:98:20000, AWS:Cloud:92:21000, Azure:Cloud:99:21000, 
		API:Microservices:97:22000, Microservices:Microservices:96:25000] */
		
		
		// skip(n) - Skipping the first n elements
		System.out.println(course.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.skip(3)
				.collect(Collectors.toList()));
		/* <O/P>-> [Docker:Cloud:92:20000, Spring:Framework:98:20000, AWS:Cloud:92:21000, Azure:Cloud:99:21000, 
		 	API:Microservices:97:22000, Microservices:Microservices:96:25000] */
		
		
		// limit(n) - Capture till nth element
		System.out.println(course.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.limit(3)
				.collect(Collectors.toList()));
		/* <O/P>-> [FullStack:FullStack:91:14000, Spring Boot:Framework:95:18000, Kubernetes:Cloud:91:20000] */
		
		
		// skip(n) & limit(m) - Skip the first n elements an then display from the remaining till mth item
		System.out.println(course.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.skip(3)
				.limit(3)
				.collect(Collectors.toList()));
		/* <O/P>-> [Docker:Cloud:92:20000, Spring:Framework:98:20000, AWS:Cloud:92:21000]*/
		
	}

}
