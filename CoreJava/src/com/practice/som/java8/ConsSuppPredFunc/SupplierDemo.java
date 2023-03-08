package com.practice.som.java8.ConsSuppPredFunc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//using traditional way
/*public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "Hi Som";
    }*/
public class SupplierDemo{

    public static void main(String[] args) {
        Supplier<String> sup = () -> "Hi Som";
        System.out.println(sup.get());

        List<String> list= Arrays.asList("Hi","Bye","Good","Welcome","Saranghae");
        System.out.println(list.stream().findAny().orElseGet(sup));

    }
}
