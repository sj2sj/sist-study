package com.iu.s3;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== WhileTest2 Start!! ====");
		
		int id = 1234;
		int pw = 5678;
		
		//1. 로그인
		//   -id, pw입력 받아 로그인 판단..
		//    로그인 성공 시 종료, 로그인 실패 시 다시 1,2 물어보기.
		//2. 종  료 
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1: 로그인 ");
			System.out.println("2: 종료 ");
			int select = sc.nextInt(); //선택 값 
			
			if (select == 1) {
				System.out.println("로그인 부분 ..");
				
				System.out.println("아이디: ");
				int inputId = sc.nextInt(); //아이디 입력 
				System.out.println("비밀번호: ");
				int inputPw = sc.nextInt(); //패스워드 입력 
				
				if (id == inputId && pw == inputPw) {
					System.out.println("로그인 성공!");
					break;
				}
				System.out.println("로그인 실패 ㅠㅠ ");
			} //if문 end...
			else {
				System.out.println("종료 ..");
				break;
			} //else문 end...
			
			
		}
		
		
		
		System.out.println("==== WhileTest2 Finish!! ====");

	}

}
