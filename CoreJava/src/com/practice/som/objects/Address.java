package com.practice.som.objects;

public class Address {
    private String line1;
    private String city;
    private int zip;
    private String state;

    public Address(String line1, String city, int zip, String state) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    @Override
    public String toString() {
        return "line1 - " + line1 + "," + "city - " + city +","+ "zip - " + zip + "," +"state - " + state;
    }
}
