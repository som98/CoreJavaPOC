package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sum_Avg_CountExample {

	public static void main(String[] args) {
		
		List<Course> course = CourseDAO.getAlldetails();
		
		Predicate<Course> PredicateReviewScoreGreaterThan95 = c -> c.getReviewScore() > 95;
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan95).collect(Collectors.toList()));
		/* O/P-> [Spring:Framework:98:20000, API:Microservices:97:22000, Microservices:Microservices:96:25000, 
		 * Azure:Cloud:99:21000]*/
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan95)
				.mapToInt(Course::getNoOfStudents)
				.sum());
		/* O/P-> 88000*/
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan95)
				.mapToInt(Course::getNoOfStudents)
				.average());
		/* O/P-> OptionalDouble[22000.0]*/
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan95)
				.mapToInt(Course::getNoOfStudents)
				.count());
		/* O/P-> 4 */
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan95)
				.mapToInt(Course::getNoOfStudents)
				.max());
		/* O/P-> OptionalInt[25000] */
		
		System.out.println(course.stream()
				.filter(PredicateReviewScoreGreaterThan95)
				.mapToInt(Course::getNoOfStudents)
				.min());
		/* O/P-> OptionalInt[20000] */

	}

}
