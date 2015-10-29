package com.ravi.test;

import java.util.Calendar;

public class Test
{

	public static void main(String[] s)
	{
		System.out.println("Test==>" + java.util.Calendar.getInstance().getTimeInMillis());
		
		long timeStamp = 1443026553908L;
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(timeStamp);
		System.out.println(calendar);
	}
}

//Calendar.getInstance().getTimeInMillis()
