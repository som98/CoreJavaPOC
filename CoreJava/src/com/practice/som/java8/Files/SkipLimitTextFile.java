package com.practice.som.java8.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SkipLimitTextFile {

	public static void main(String[] args) throws IOException {
		
		//Reading data from file into a List using nio.File
		List<String> listData= Files.readAllLines(Paths.get("data.txt"));
		
		//Skipping the header from the file and the last line
		listData.stream()
		.skip(1)
		.limit(listData.size()-2)
		.forEach(System.out::println);
	}

}
