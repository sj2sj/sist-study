package com.iu.s2;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==== ForTest1 Start ====");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복할 횟수를 입력하세요: ");
		int count = sc.nextInt();
		
		//입력한 숫자만큼 문자열 출력
		for (int i = 0; i < count; i++) {
			System.out.println("Hello world! " +i);
		}
		
		
		//0~20미만 사이 짝수만 출력 (if문 사용)
//		for (int i = 0; i < 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		//0~20미만 사이 짝수만 출력 (if문 사용 x)
		for (int i = 0; i < 20; i=i+2) {
			System.out.println(i);
		}
		
		
		
		
		System.out.println("==== ForTest1 Finish ====");
	}

}
