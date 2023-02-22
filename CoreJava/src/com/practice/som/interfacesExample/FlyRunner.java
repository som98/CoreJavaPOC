package com.practice.som.interfacesExample;

public class FlyRunner {

    public static void main(String[] args) {

        int arr[] = new int[5];
        Flyable flyingObjects[]= {new Bird(),new Aeroplane()};
        for (Flyable f: flyingObjects){
            //System.out.println(f);
            f.fly();
        }
    }
}
