package com.practice.som.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterFunctionDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Som","Mrinmoy","Sayak","Shamit","Montu","Abhirup");
        list.stream().filter(t->t.startsWith("S")).forEach(t -> System.out.println(t));

    }



}
