package com.practice.som.java8.OptionalClass;

import java.util.Optional;

public class Optional_DemoBasics1 {
    public static void main(String[] args)
    {
    	String[] words= new String[10];
    	words[5]="Hello Som";
    	Optional<String> checkWords = Optional.ofNullable(words[5]);
    	if(checkWords.isPresent()) {
    		System.out.println(words[5].toLowerCase());
    	}
    	else {
    		System.out.println("No words present - Null value");
    	}
    }
}