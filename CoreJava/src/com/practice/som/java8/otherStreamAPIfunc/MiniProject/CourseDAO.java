package com.practice.som.java8.otherStreamAPIfunc.MiniProject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseDAO {

	public static List<Course> getAlldetails(){
		
		return List.of(new Course("Spring", "Framework", 98, 20000),
					new Course("Spring Boot", "Framework", 95, 18000), 
					new Course("API", "Microservices", 97, 22000),
					new Course("Microservices", "Microservices", 96, 25000),
					new Course("FullStack", "FullStack", 91, 14000), 
					new Course("AWS", "Cloud", 92, 21000),
					new Course("Azure", "Cloud", 99, 21000), 
					new Course("Docker", "Cloud", 92, 20000),
					new Course("Kubernetes", "Cloud", 91, 20000));
		
		
		//ALTERNATIVE WAY TO STORE AN ARRAY OF OBJECTS INTO A LIST WITH THE HELP OF STREAM FUNCTION
		
		/* return Stream.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), 
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), 
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), 
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000))
			.collect(Collectors.toList());
			*/
	}
	
}
