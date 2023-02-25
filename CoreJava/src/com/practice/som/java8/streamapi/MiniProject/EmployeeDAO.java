package com.practice.som.java8.streamapi.MiniProject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<Employee> getDetails(){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"Som","TCS",800000));
        list.add(new Employee(102,"Soham","Infosys",920000));
        list.add(new Employee(103,"Subham","ARW",1300000));
        list.add(new Employee(104,"Tanishq","TCS",780000));
        list.add(new Employee(105,"Rishav","LTIMindtree",600000));

        return list;
    }
}
