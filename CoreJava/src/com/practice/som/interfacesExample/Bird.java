package com.practice.som.interfacesExample;

public class Bird implements Flyable{
//    public Bird() {
//        System.out.println("Bird");
//    }

    @Override
    public void fly() {
        System.out.println("With wings");
    }
}
