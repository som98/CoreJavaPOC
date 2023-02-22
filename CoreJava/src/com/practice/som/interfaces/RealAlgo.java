package com.practice.som.interfaces;

public class RealAlgo implements ComplexAlgo{

    @Override
    public int addUp(int a, int b) {
        return (a+b);
    }

    @Override
    public void print() {
        System.out.println("RealAlgo print");
    }
}
