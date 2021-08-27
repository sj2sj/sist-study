package com.iu.s2.calendar;

import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar ca = Calendar.getInstance();
		
		//2021년 7월 29일
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println(year+"년 "+month+"월");
		
		
		Date date = ca.getTime();
		String format = "yyyy년 MM월 dd일 E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		String result = sdf.format(date);
		System.out.println(result);

	}

}
