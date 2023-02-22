package com.practice.som.java8.streamapi.MiniProject;

public class Employee {

    private int empid;
    private String name;

    public Employee(int empid, String name, String company, int salary) {
        this.empid = empid;
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    private String company;
    private int salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
