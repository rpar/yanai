package com.ravi.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UTCTime {

	public static void main(String[] s) throws Exception {
		
		//testUTC();
		
		testDate();
	}
	public static void testUTC() throws Exception {

		String utc = "20151113083000";
		int offset = 1;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
		TimeZone timeZone = TimeZone.getTimeZone("GMT");
		timeZone.setRawOffset(offset);
		dateFormat.setTimeZone(timeZone);
		Date parsedDate = dateFormat.parse(utc);
		
		System.out.println("Time=>" + parsedDate);
		
		getMilliSecond(parsedDate.getTime());
	}

	public static void getMilliSecond(long timeStamp) {
		// System.out.println("Test==>" +
		// java.util.Calendar.getInstance().getTimeInMillis());

		// timeStamp = 1447365162000L;
		Calendar calendar = Calendar.getInstance();
		System.out.println(new Date(calendar.getTimeInMillis()));
		
		calendar.setTimeInMillis(timeStamp);
		System.out.println(calendar);

		System.out.println(new Date(timeStamp));

		timeStamp = 1447403399L * 1000 ;
		calendar.setTimeInMillis(timeStamp);
		System.err.println(new Date(timeStamp));
		
	}
	
	
	public static void testDate() throws Exception {
		
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Long timestamp = 1447404228L * 1000;
		
		System.out.println(df.format(new Date(timestamp) ) );
	}	
	
	
}


