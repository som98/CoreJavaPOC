package com.practice.som.interfaces;

public interface ComplexAlgo {

    int addUp(int a, int b);

    default void print()
    {
        System.out.println("Default");
    }
}
