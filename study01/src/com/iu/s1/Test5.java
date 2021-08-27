package com.iu.s1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test5 Start ====");
		
		int num = 0;
		num = num + 1;
		
		char ch = 'a';
		
		int num1 = 3;
		long num2 = 5L;
		
		System.out.println(num1 + num2);
		
		//형변환
		//강제형변환 (높은거->낮은거)
		num1 = (int)num2;
		System.out.println(num1);
		
		
		//다시 초기화
		num1 = 3;
		num2 = 9L;
		
		//자동형변환 (낮은거->높은거) 굳이 형변환 표기 하지 않아도 됨.
		num2 = num1;
		System.out.println(num2);
		
	
		//char형을 int로 형변환 가능.
		//문자 '1' 아스키코드로 변환한 값으로 대입됨
		char ch2 = '1';
		int num3 = ch2;
		System.out.println("num3: " + num3);
		
		ch2 = 'a';
		num3 = ch2;
		System.out.println("num3: " + num3);
		
		ch2 = (char)(num3+25); //num3에 +1한 값을 char타입으로 변환
		System.out.println("ch2: " + ch2);
		
		long num4 = 10L;
		float f1 = num4;
	}

}
