package com.iu.s1;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test13 Start ====");
		
		//1 --> 요금조회
		//2 --> 상품가입 
		//3 --> 고장신고 
		//0 --> 상담원 연결
		//그 외 --> 잘못 누름. 다시 선택
		
		System.out.println("1. 요금 조회");
		System.out.println("2. 상품 가입");
		System.out.println("3. 고장 신고");
		System.out.println("0. 상담원 연결");
		
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt(); //입력 번호
		
		switch(inputNum) {
			case 1: 
				System.out.println("요금 조회");
				break;
			case 2:
				System.out.println("상품 가입");
				break;
			case 3:
				System.out.println("고장 신고");
				break;
			case 0:
				System.out.println("상담원 연결");
				break;
			default:
				int num = 10;
				System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
		}
		
		if (inputNum > 0) {
			int num2 = 20;
		}
		System.out.println(inputNum);
		
		
		System.out.println("==== Test13 Finish ====");
	}

}
