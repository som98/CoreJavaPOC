package com.practice.som.java8.ConsSuppPred;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    /*@Override
    public void accept(Integer t) {
        System.out.println("print: " +t);
    }*/

    public static void main(String[] args) {
       // Consumer<Integer> con= t -> System.out.println("print: " +t);
       // con.accept(4);

        List<Integer> list= Arrays.asList(1,2,3,4,5);
       // list.stream().forEach(con);
        
        list.forEach(t -> System.out.println("print: " +t));

    }

}
