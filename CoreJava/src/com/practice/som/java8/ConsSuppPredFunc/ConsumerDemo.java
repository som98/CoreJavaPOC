package com.practice.som.java8.ConsSuppPredFunc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//If you override the accept method need to implement the Consumer interface
//public class ConsumerDemo implements Consumer<Integer> {

	// Overridden accept method (traditional way)
	/*
	@Override
	public void accept(Integer t) {
		System.out.println("print: " + t);
	}
	*/
public class ConsumerDemo {
	
	public static void main(String[] args) {

		// Creating an object to use the accept method by lambda function
		Consumer<Integer> con = t -> System.out.println("print: " + t);
		con.accept(4);

		// Creating an Integer list
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// Displaying each elements by invoking the Consumer function through Stream and
		// Lambda func (simplified way)
		list.stream().forEach(t -> System.out.println("print: " + t));

	}

}
