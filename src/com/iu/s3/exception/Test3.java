package com.iu.s3.exception;

public class Test3 {

	public void t3() throws MyException {
		
		//사용자가 유치원생
		//1. 두자리수 넘어가면 모름 
		//2. 음 모름 
		//1,2의 경우 예외가 발생하도록 사용자정의예외클래스 생성
		int num1 = 40;
		int num2 = 50;
		
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		
		if (num3 > 99) {
			throw new MyException("세자리 수는 몰라요ㅠㅠ");
		}
		
		if (num4 < 0) {
			throw new MyException("음수는 몰라용ㅠㅠ");
		}
		
		System.out.println(num3);
	}
	
}
