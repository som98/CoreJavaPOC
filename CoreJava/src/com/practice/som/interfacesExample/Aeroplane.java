package com.practice.som.interfacesExample;

public class Aeroplane implements Flyable{


//    public Aeroplane() {
//        System.out.println("Aeroplane");
//    }

    @Override
    public void fly() {
        System.out.println("With fuel");
    }
}
