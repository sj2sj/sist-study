package com.iu.s1;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test4 Start ====");
		
		//10대 유무 판별
		//나이가 10보다 크고 20미만.
		
		/* 키보드로부터 나이를 입력받아 10대면 청소년을 출력하고 종료, 아니면 그냥 종료 */
		
		int age = 0; //나이 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		age = sc.nextInt();
		
		if (age >=10 && age < 20) {
			System.out.println("청소년");
		} 
		
		System.out.println("==== Test4 Finish ====");
	
		boolean tt = true && true || false;
		System.out.println(tt);
	}
}
