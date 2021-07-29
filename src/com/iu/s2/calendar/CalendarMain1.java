package com.iu.s2.calendar;

import java.util.*;

public class CalendarMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//현재 날짜와 시간의 정보
		Calendar ca = Calendar.getInstance(); //new GregorianCalendar();
		System.out.println(ca);
		
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year: " + year);
		
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println("month: " + month);
		
		int date = ca.get(Calendar.DATE);
		System.out.println("Date: " + date);
		
		int hour = ca.get(Calendar.HOUR_OF_DAY); //HOUR: 1, 2, 3... 12 / HOUR_OF_DAY: 1, 2, ...24
		System.out.println("Hour: " + hour);
		
		int minute = ca.get(Calendar.MINUTE);
		System.out.println("Minute: " + minute);
		
		int second = ca.get(Calendar.SECOND);
		System.out.println("Second: " + second);
		
		
		Date d = new Date();
		System.out.println(d);
	}

}
