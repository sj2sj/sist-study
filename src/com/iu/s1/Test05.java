package com.iu.s1;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test5 Start ====");
		
		Scanner sc = new Scanner(System.in);
		
		
		//회원가입 시 입력한 id
		int id = 1234;
		//회원가입 시 입력한 pw
		int pw = 5678;
		
		int inputId = 0;
		int inputPw = 0;
		
	
		System.out.println("ID를 입력하세요: ");
		inputId = sc.nextInt();
		
		System.out.println("PW를 입력하세요: ");
		inputPw = sc.nextInt();
		
		if (id == inputId && pw == inputPw) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패 ㅠㅠ");
		}
		
		
		
	
		System.out.println("==== Test5 Finish ====");
	}

}
