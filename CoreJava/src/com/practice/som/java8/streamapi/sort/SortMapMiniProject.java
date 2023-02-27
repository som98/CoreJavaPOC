package com.practice.som.java8.streamapi.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.practice.som.java8.streamapi.MiniProject.Employee;

public class SortMapMiniProject {

	public static void main(String[] args) {

		// Sorting a Map w.r.t to a Key - field(here - Salary) using traditional way - (Comparator sort)

		/*
		 * Map<Employee, Integer> empMap = new TreeMap<>(new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return o1.getSalary() - o2.getSalary(); } });
		 */

		// Sorting a Map w.r.t to a Key - field(here - Salary) using Lambda Expression
		Map<Employee, Integer> empMap = new TreeMap<>((o1, o2) -> o1.getSalary() - o2.getSalary());

		empMap.put(new Employee(101, "Som", "TCS", 800000), 60);
		empMap.put(new Employee(102, "Soham", "Infosys", 920000), 90);
		empMap.put(new Employee(103, "Subham", "ARW", 1300000), 50);
		empMap.put(new Employee(104, "Tanishq", "TCS", 780000), 40);
		empMap.put(new Employee(105, "Rishav", "LTIMindtree", 600000), 120);

		//Sorting a Map w.r.t. an object's field (here Key) using Stream API expression after Map<Object,Primitive Data type> declaration
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpid))).forEach(System.out::println);
		
		//Sorting a Map w.r.t. an object's field (here Key) using Stream API expression after Map<Object,Primitive Data type> declaration - Descending
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getCompany).reversed())).forEach(System.out::println);
		
		System.out.println(empMap);
	}

}
