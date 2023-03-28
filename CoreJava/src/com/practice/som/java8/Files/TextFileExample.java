package com.practice.som.java8.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class TextFileExample {

	public static void main(String[] args) throws IOException {

		// To read any file using Functional programming
		Files.lines(Paths.get("file"))
			.forEach(System.out::println);
		
		System.out.println("==========================================");
		
		// To read any file and do operations (splitting w.r.t. space, showing distinct words and sorted alphabetically)
		Files.lines(Paths.get("file"))
		.map(s->s.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("==========================================");		 
		
		// Displays all the files and folders under the root directory
		Files.list(Paths.get("."))
		.forEach(System.out::println);
		
		System.out.println("==========================================");
		
		// // Displays only the folders under the root directory
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);
		
	}

}
