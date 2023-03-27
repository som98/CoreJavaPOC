package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Max_Min_Example {

	public static void main(String[] args) {
		
		List<Course> course = CourseDAO.getAlldetails();
		
		Predicate<Course> PredicateReviewScoreLessThan90 = c -> c.getReviewScore() < 90;
		
		Comparator<Course> comparingByNoOfStudentsAndReviewScore = 
				Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore);
		
		System.out.println(course.stream()
				.sorted(comparingByNoOfStudentsAndReviewScore)
				.collect(Collectors.toList()));
		/* O/P-> [FullStack:FullStack:91:14000, Spring Boot:Framework:95:18000, Kubernetes:Cloud:91:20000, 
		 * Docker:Cloud:92:20000, Spring:Framework:98:20000, AWS:Cloud:92:21000, Azure:Cloud:99:21000, 
		 * API:Microservices:97:22000, Microservices:Microservices:96:25000]*/
		
		// To capture the Maxm details in the List in Optional return type
		System.out.println(
				course.stream()
				.max(comparingByNoOfStudentsAndReviewScore));
		/* O/P-> Optional[Microservices:Microservices:96:25000]*/
		
		// To capture the Maxm details or display the other clause item in the List
		System.out.println(
				course.stream()
				.max(comparingByNoOfStudentsAndReviewScore)
				.orElse(new Course("GCP", "Cloud", 94, 17000))
				);
		/* O/P-> Microservices:Microservices:96:25000*/
		
		// To capture the Minm details in the List in Optional return type
		System.out.println(
				course.stream()
				.min(comparingByNoOfStudentsAndReviewScore));
		/* O/P-> Optional[FullStack:FullStack:91:14000]*/
		
		// To capture the Minm details or display the other clause item in the List
		System.out.println(
				course.stream()
				.min(comparingByNoOfStudentsAndReviewScore)
				.orElse(new Course("GCP", "Cloud", 94, 17000))
				);
		/* O/P-> FullStack:FullStack:91:14000*/
		
		// Filtering the data w.r.t. the predicate and returning the Maxm item.
		System.out.println(course.stream()
				.filter(PredicateReviewScoreLessThan90)
				.max(comparingByNoOfStudentsAndReviewScore));
		/* O/P-> Optional.empty*/
		
		// Filtering the data w.r.t. the predicate and returning the Maxm item, 
								//if not present capture the other clause item.
		System.out.println(course.stream()
				.filter(PredicateReviewScoreLessThan90)
				.max(comparingByNoOfStudentsAndReviewScore)
				.orElse(new Course("GCP", "Cloud", 94, 17000)));
		/* O/P-> GCP:Cloud:94:17000*/
		
	}

}
