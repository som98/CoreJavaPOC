package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindFirst_FindAnyExample {

	public static void main(String[] args) {

		List<Course> course = CourseDAO.getAlldetails();
		
		Predicate<Course> PredicateReviewScoreGreaterThan90 = c -> c.getReviewScore() > 90;		
		Predicate<Course> PredicateReviewScoreLessThan90 = c -> c.getReviewScore() < 90;
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan90).collect(Collectors.toList()));
		/* O/P-> [Spring:Framework:98:20000, Spring Boot:Framework:95:18000, API:Microservices:97:22000, 
		 * Microservices:Microservices:96:25000, FullStack:FullStack:91:14000, AWS:Cloud:92:21000, 
		 * Azure:Cloud:99:21000, Docker:Cloud:92:20000, Kubernetes:Cloud:91:20000]
		 */
		
		// Returns Empty as no data are present acc to the criteria
		System.out.println(course.stream()
				.filter(PredicateReviewScoreLessThan90)
				.findFirst());
		/* O/P-> Optional.empty*/
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan90)
				.findFirst());
		/* O/P-> Optional[Spring:Framework:98:20000]*/
		
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan90)
				.findAny());
		/* O/P-> Optional[Spring:Framework:98:20000]*/
	}

}
