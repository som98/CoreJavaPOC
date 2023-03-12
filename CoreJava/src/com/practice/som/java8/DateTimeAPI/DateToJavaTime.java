package com.practice.som.java8.DateTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToJavaTime {

	public static void main(String[] args) {

		Date date = new Date();
		// Convert to LocalDate
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(localDate.toString());

		// Convert to LocalDateTime
		LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(localDateTime);

		// 1. Convert Date -> Instant
		Instant instant = date.toInstant();
		System.out.println("instant : " + instant);

	}

}
