package com.practice.som.objects;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("27/7 Northern Avenue","Kolkata",700037, "WB");
        Customer customer = new Customer("Som", homeAddress);

        Address workAddress = new Address("AA II Newtown","Kolkata",7000160, "WB");
        customer.setWorkaddress(workAddress);

        System.out.println("Home Address:: "+homeAddress);
        System.out.println("Work Address:: "+workAddress);
        System.out.println(customer);

    }
}
