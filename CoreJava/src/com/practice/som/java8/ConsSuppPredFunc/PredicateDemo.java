package com.practice.som.java8.ConsSuppPredFunc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Using traditional way of implementing Predicate Functional Interface
/*public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if (integer%2==0)
            return true;
        else
            return false;
    }*/

public class PredicateDemo{

    public static void main(String[] args) {
    	
    	//Implementing Predicate by lambda function showing detailed code
        /*Predicate<Integer> pr = integer -> {
            if (integer%2==0)
                return true;
            else
                return false;
        } ;*/
    	
    	//More optimised way to use predicate functional interface (object will understand true/false)
        Predicate<Integer> pr = integer -> integer%2==0;
    	
        //To test one value at a time
        //Display output in true or false
    	System.out.println(pr.test(6));   
        System.out.println(pr.test(15));
  

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        
        //To check all the values in the list w.r.t. a Predicate function
        list.stream().filter(pr).forEach(integer -> System.out.println("Print Even : "+integer));

        

    }
}
