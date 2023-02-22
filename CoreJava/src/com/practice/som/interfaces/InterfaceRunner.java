package com.practice.som.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        //ComplexAlgo ca = new RealAlgo();
        RealAlgo ra = new RealAlgo();
        ComplexAlgo ica = new RealAlgo();
        //System.out.println(ca.addUp(10,20));
        ra.print();
        ica.print();

    }
}
