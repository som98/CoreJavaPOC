package com.practice.som.java8.streamapi.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.practice.som.java8.streamapi.MiniProject.Employee;
import com.practice.som.java8.streamapi.MiniProject.EmployeeDAO;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(17);
		list.add(8);
		list.add(25);
		list.add(10);

		/*
		 * Collections.sort(list); // Sort in ascending order using traditional way
		 * Collections.reverse(list); // Sort in descending order ( .sort() is must before using .reverse()) using traditional way
		 * System.out.println(list);
		 */

		// Sorting using Stream API
		/*
		 * list.stream().sorted().forEach(t -> System.out.println(t)); //Ascending Order 
		 * 
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t)); //Descending Order
		 */

		List<Employee> emp = EmployeeDAO.getDetails();

		// Traditional Comparator way by creating a separate class - 1
		// Collections.sort(emp, new MyComparator());

		// Traditional Comparator way by directly creating an object of the interface - 2
		/*
		 * Collections.sort(emp, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return o1.getSalary() - o2.getSalary(); } });
		 */

		// Using Lambda Expression- 3
		/*
		 * Collections.sort(emp, (o1,o2)-> o1.getSalary() - o2.getSalary()); //Ascending
		 * 
		 * System.out.println(emp);
		 */

		// Using Stream API functions- 4
		// emp.stream().sorted((o1,o2)-> o2.getSalary() - o1.getSalary()).forEach(t->System.out.println(t)); //Ascending

		// Using Stream API functions (Simpler way) - 5
		// emp.stream().sorted(Comparator.comparing(e->e.getSalary())).forEach(System.out::println); //Ascending by Default

		// Using Stream API functions without Lambda Functions (Simplest way) - 6
		emp.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println); // Ascending by Default

	}

}

//Traditional Comparator way by creating a separate class - 1
/*
 * class MyComparator implements Comparator<Employee> {
 * 
 * @Override public int compare(Employee o1, Employee o2) {
 * 
 * return o1.getSalary() - o2.getSalary(); //Ascending order }
 * 
 * }
 */
