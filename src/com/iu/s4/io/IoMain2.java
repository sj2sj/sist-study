package com.iu.s4.io;

import java.util.Calendar;
import java.util.HashSet;
import java.util.UUID;

public class IoMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "";
		//fileName을 생성하는 코드
		HashSet<String> hs = new HashSet<>();
		hs.add(fileName);
		
		fileName = "abc";
		
		for (int i = 0; i < 100; i++) {
			fileName = "abc"+i;
		}
		
		Calendar calendar = Calendar.getInstance();
		
		long t = calendar.getTimeInMillis();
		
		//몇번을 돌리든 중복 X 보장 (시간은 항상 흐르기 때문에)
		fileName = String.valueOf("fileName: "+t);
		System.out.println(fileName);
		
		fileName = UUID.randomUUID().toString();
		
		
		//몇번을 돌리든 중복되지 않아야함
		System.out.println(fileName);
	}

}
