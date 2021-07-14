package com.iu.s3;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== WhileTest1 Start!! ====");
	
		//0~4까지 출력 (for)
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		
		//0~4까지 출력 (while)
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		
		
		////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while (check) {
			System.out.println("1: 회원가입");
			System.out.println("2: 로그인");
			System.out.println("3: 종료 ");
			
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("회원가입 코드 진행..");
			} else if (select == 2) {
				System.out.println("로그인 코드 진행..");
			} else {
				check = !check;
				System.out.println("종료..");
			}
			
		}
		
		System.out.println("==== WhileTest1 Finish!! ====");
	}

}
