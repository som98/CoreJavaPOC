package com.practice.som.java8.ConsSuppPred;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//using traditional way
/*public class PredicateDemo implements Predicate<Integer> {*/

   /* @Override
    public boolean test(Integer integer) {
        if (integer%2==0)
            return true;
        else
            return false;
    }*/

public class PredicateDemo{

    public static void main(String[] args) {
        /*Predicate<Integer> pr = integer -> {
            if (integer%2==0)
                return true;
            else
                return false;
        } ;*/

        //More optimised way to use predicate functional interface
        Predicate<Integer> pr = integer -> integer%2==0;

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().filter(pr).forEach(integer -> System.out.println("Print Even : "+integer));

        /*System.out.println(pr.test(6));
        System.out.println(pr.test(15));*/

    }
}
