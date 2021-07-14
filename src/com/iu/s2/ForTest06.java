package com.iu.s2;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== ForTest6 Start ====");
		
		//회원가입 시 입력한 id
		int id = 1234;
		//회원가입 시 입력한 pw
		int pw = 5678;
		
		//1. 최대 5번 로그인 시도 (5번 넘으면 프로그램 종료) 
		//2. 로그인 성공 시 프로그램 종료
		
		Scanner sc = new Scanner(System.in);

		boolean flag = false;
		
		for (int count = 0; count < 5; count++) {
			if (count != 0) { //2번째 시도부터 출력...
				System.out.println(count+1+"번째 시도 ");
			}
			
			//아이디, 비밀번호 입력 
			System.out.println("아이디를 입력하세요: ");
			int inputId = sc.nextInt();
			System.out.println("비밀번호를 입력하세요: ");
			int inputPw = sc.nextInt();
			
			//아이디와 비밀번호가 일치하면 for문 종료...
			if (id == inputId && pw == inputPw) {
//				System.out.println("로그인 성공!");
				flag = true;
				break;
			}
			
			System.out.println("로그인 실패, 다시 시도하세요.");
		}
		
		//for 종료 후에 로그인 현황을 알려준다..
		if (flag) { //시도 횟수가 5번 넘으면 if문 실행.
			System.out.println("로그인 성공 ");
		} else {
			System.out.println("로그인 실패 은행에 방문해주세요!");
		}
		
		
		
		
		System.out.println("==== ForTest6 Finish ====");
	}

}
