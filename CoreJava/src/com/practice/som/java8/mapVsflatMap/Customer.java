package com.practice.som.java8.mapVsflatMap;

import java.util.List;

public class Customer {

	private int empid;
	private String name;
	private String email;
	private List<String> phoneNumbers;

	public Customer(int empid, String name, String email, List<String> phoneNumbers) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Customer [empid=" + empid + ", name=" + name + ", email=" + email + ", phoneNumbers=" + phoneNumbers
				+ "]";
	}

}
