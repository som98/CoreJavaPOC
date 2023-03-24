package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.List;
import java.util.function.Predicate;

public class All_None_AnyMatchExample {

	public static void main(String[] args) {

		List<Course> courses = CourseDAO.getAlldetails();

		Predicate<Course> PredicateReviewScoreGreaterThan90 = c -> c.getReviewScore() > 90;

		Predicate<Course> PredicateReviewScoreGreaterThan95 = c -> c.getReviewScore() > 95;

		Predicate<Course> PredicateReviewScoreLessThan90 = c -> c.getReviewScore() < 90;

		
		/* allMatch */
		System.out.println(courses.stream().allMatch(PredicateReviewScoreGreaterThan90));
		// Returns "true" as all the ReviewScores are >90

		System.out.println(courses.stream().allMatch(PredicateReviewScoreGreaterThan95));
		// Returns "false" as all the ReviewScores are not >95

		
		/* noneMatch */
		System.out.println(courses.stream().noneMatch(PredicateReviewScoreLessThan90));
		// Returns "true" as no ReviewScores are <90

		
		/* anyMatch */
		System.out.println(courses.stream().anyMatch(PredicateReviewScoreLessThan90));
		// Returns "false" as it cannot find any ReviewScores  <90
		
		System.out.println(courses.stream().anyMatch(PredicateReviewScoreGreaterThan95));
		// Returns "true" as it can find atleast one > 95
	}

}
