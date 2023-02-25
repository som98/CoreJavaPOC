package com.practice.som.interfacesExample;

public class FlyRunner {

    public static void main(String[] args) {

        Flyable flyingObjects[]= {new Bird(),new Aeroplane()};
        for (Flyable f: flyingObjects){
            //System.out.println(f);
            f.fly();
        }
    }
}
