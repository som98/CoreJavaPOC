package com.practice.som.java8.parallelStream.MiniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class ParallelStreamProjectExample {
	
	public static void main(String[] args) {
		
		long start = 0;
		long end=0;
		
		List<Employee> employees= EmployeeDAO.getEmployeeDetails();
		
		
		start = System.currentTimeMillis();
		double plainStreamSalary=employees.stream().map(t->t.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		
		System.out.println("Plain Stream execution time : "+ (end-start));
		System.out.println("Plain Stream Salary Average : "+ plainStreamSalary);
		
		start = System.currentTimeMillis();
		double parallelStreamSalary=employees.stream().parallel().map(t->t.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		
		System.out.println("Parallel Stream execution time : "+ (end-start));
		System.out.println("Parallel Stream Salary Average : "+ parallelStreamSalary);
	}

}
