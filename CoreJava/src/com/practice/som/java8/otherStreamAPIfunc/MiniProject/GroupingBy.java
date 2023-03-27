package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {

		List<Course> course = CourseDAO.getAlldetails();
		
		// To group the items w.r.t to a particular field(here Category)
		System.out.println(course.stream()
				.collect(Collectors.groupingBy(Course::getCategory)));
		/* O/P-> {Cloud=[AWS:Cloud:92:21000, Azure:Cloud:99:21000, Docker:Cloud:92:20000, Kubernetes:Cloud:91:20000], 
		 * FullStack=[FullStack:FullStack:91:14000], 
		 * Microservices=[API:Microservices:97:22000, Microservices:Microservices:96:25000], 
		 * Framework=[Spring:Framework:98:20000, Spring Boot:Framework:95:18000]}*/
		
		
		// To group the items w.r.t to a particular field and count how many belongs to that field (here Category)
		System.out.println(course.stream()
				.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
		/* O/P-> {Cloud=4, FullStack=1, Microservices=2, Framework=2}*/
		
		
		// To group the items w.r.t to a particular field and find the maxm item w.r.t. another field
		System.out.println(course.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
						Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		/* O/P-> {Cloud=Optional[Azure:Cloud:99:21000], FullStack=Optional[FullStack:FullStack:91:14000], 
		 * Microservices=Optional[API:Microservices:97:22000], Framework=Optional[Spring:Framework:98:20000]}*/

		// To group the items w.r.t to a particular field and display particular field property
		System.out.println(course.stream()
				.collect(Collectors.groupingBy(Course::getCategory,
						Collectors.mapping(Course::getName, Collectors.toList()))));
		/* O/P-> {Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], 
		 * Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}*/
	}

}
