package com.practice.som.java8.streamapi.MiniProject;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<Employee> evalTax(String a) {
        return a.equalsIgnoreCase("tax") ?
                EmployeeDAO.getDetails().stream().filter(t -> t.getSalary() > 800000).collect(Collectors.toList())
                : EmployeeDAO.getDetails().stream().filter(t -> t.getSalary() <= 800000).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(evalTax("tax"));
        System.out.println(evalTax("notax"));
    }
}
