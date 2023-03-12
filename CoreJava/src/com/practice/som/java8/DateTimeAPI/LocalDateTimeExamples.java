package com.practice.som.java8.DateTimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExamples {

	public static void main(String[] args) {

		// Convert string to local date time

		String now = "2017-06-13 12:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);
		System.out.println("Before : " + now);
		System.out.println("After : " + formatDateTime);
		System.out.println("After : " + formatDateTime.format(formatter));

		///////////////////////////////////////////////////////////////////////////////

		// Convert instant to localDateTime

		Instant instant = Instant.now();
		System.out.println("Instant : " + instant);
		LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
		System.out.println("LocalDateTime : " + ldt);

	}

}
