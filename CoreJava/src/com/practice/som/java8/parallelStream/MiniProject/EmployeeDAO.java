package com.practice.som.java8.parallelStream.MiniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EmployeeDAO {
	
	public static List<Employee> getEmployeeDetails(){
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i=1; i<=100;i++) {
			
			employees.add(new Employee(i,"Employee "+i,"A",Double.valueOf(new Random().nextInt(1000*100))));
		}
		
		return employees;
	}

}
