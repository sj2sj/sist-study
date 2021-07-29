package com.iu.s2.random;

import java.util.Random;

public class Password {

	/*
	 * makePassword()
	 * 랜덤한 패스워드 생성
	 * 대문자, 소문자, 숫자 조합
	 * 8글자 
	 * ex. a4bcD5P0
	 * 1. 대문자, 소문자, 숫자 결정 (컴퓨터가) random.nextInt(3);
	 * 2. 글자 랜덤 .아스키코드 
	 * 대문자: 65~90, 소문자: 97~122, 숫자: 48~57
	 */  
	public String makePassword() {
		Random random = new Random();
		
		//char[] passChar = new char[8];
		
		String result = "";
		StringBuffer sb = new StringBuffer();
			
		for (int i = 0; i < 8; i++) {
			//1=대문자, 2=소문자, 3=숫자
			int r = random.nextInt(3);
			
			
			if (r == 0) { //대문자
				char c = (char)(random.nextInt(26)+65);
				sb.append(c);
			} else if (r == 1) { //소문자
				char c  = (char)(random.nextInt(26)+97);
				sb.append(c);
			} else { //숫자
				char c  = (char)(random.nextInt(10)+48);
				sb.append(c);
			}
		}
		
		return sb.toString();
		
		
	}
	
	
}
