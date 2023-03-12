package com.practice.som.java8.DateTimeAPI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//Simple example to use the new API for Date and Time operations.
public class CurrentDateTime {

	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // DateFormat can also show the
																						// Time
																						// and is used to display the
																						// result in a
																						// particular format.

	// SimpleDateFormat
	// Processing to convert from Date to String. Pass java.util.Date type as an
	// argument to format method.

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // Works almost
																										// similar to
																										// DateFormat
																										// but has
																										// different
																										// characteristics
	// DateTimeFormatter
	// Pass TemporalAccessor as an argument to the format method (LocalDateTime)

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date); 								// Sun Mar 12 10:20:36 IST 2023
		System.out.println(sdf.format(date)); 					// 2023/03/12 10:20:36

		Calendar cal = Calendar.getInstance();
		System.out.println(cal); /*
									 * java.util.GregorianCalendar[time=1678596636129,areFieldsSet=true,
									 * areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=
									 * "Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,
									 * lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,
									 * MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=71,
									 * DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=20
									 * ,SECOND=36,MILLISECOND=129,ZONE_OFFSET=19800000,DST_OFFSET=0]
									 */
		System.out.println(sdf.format(cal.getTime()));			 // 2023/03/12 10:20:36

		LocalDateTime localDateTimenow = LocalDateTime.now();
		System.out.println(localDateTimenow); 					// 2023-03-12T10:20:36.132407600
		System.out.println(dtf.format(localDateTimenow)); 		// 2023/03/12 10:20:36

		LocalDate localDatenow = LocalDate.now();
		System.out.println(localDatenow); 						// 2023-03-12
		System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDatenow));	 // 2023/03/12
	}

}
