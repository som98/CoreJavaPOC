package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample {

	public static void main(String[] args) {


		List<Course> course = CourseDAO.getAlldetails();
		
		//Comparing in Increasing order w.r.t. one field - 1
		Comparator<Course> comparingByNoOfStudentsIncreasing = 
						Comparator.comparing(Course::getNoOfStudents);
		
		//Comparing in Decreasing order w.r.t. one field - 2
		Comparator<Course> comparingByNoOfStudentsDecreasing = 
						Comparator.comparing(Course::getNoOfStudents).reversed();
		
		//Comparing in Increasing order w.r.t. one field and then another field - 3
		Comparator<Course> comparingByNoOfStudentsAndReviewScoreIncreasing = 
				Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore);
		
		
		//Increasing order w.r.t. one field - 1
		System.out.println(course.stream()
				.sorted(comparingByNoOfStudentsIncreasing)
				.collect(Collectors.toList()));
		
		//Decreasing order w.r.t. one field - 2
		System.out.println(course.stream()
				.sorted(comparingByNoOfStudentsDecreasing)
				.collect(Collectors.toList()));
		
		
		//Increasing order w.r.t. one field and then another field - 3
				System.out.println(course.stream()
						.sorted(comparingByNoOfStudentsAndReviewScoreIncreasing)
						.collect(Collectors.toList()));
		
		
	}

}
