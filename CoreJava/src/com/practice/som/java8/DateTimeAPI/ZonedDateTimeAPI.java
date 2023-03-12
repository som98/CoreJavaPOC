package com.practice.som.java8.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeAPI {

	public static void main(String[] args) {

		ZonedDateTime date = ZonedDateTime.parse("2020-08-28T19:10:38.492+05:30[Asia/Kolkata]");
		ZonedDateTime result = date.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
		System.out.println(result);
		
		
		//To print the zone IDs without knowing details
		//System.out.println(ZoneId.getAvailableZoneIds());
		
		System.out.println("Asia/Kathmandu: "+LocalDateTime.now(ZoneId.of("Asia/Kathmandu")));
		System.out.println("Asia/Dhaka: "+LocalDateTime.now(ZoneId.of("Asia/Dhaka")));
		System.out.println("Asia/Karachi: "+LocalDateTime.now(ZoneId.of("Asia/Karachi")));
		
		System.out.println("Home Time: "+LocalDateTime.now());
	}

}
