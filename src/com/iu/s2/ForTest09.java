package com.iu.s2;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== ForTest9 Start ====");
		
		//FPS 게임.
		//탄창 3개. 한 탄창에 총알이 30발
		
		//단발 모드 (총알 1발), 점사모드 (총알 3발)
		//1번 선택: 단발 모드 (탕) 탕 30번
		//2번 선택: 점사 모드 (탕탕탕) 타타탕 10번
		//다른 번호 입력 시: 점사 모드 
		
		Scanner sc = new Scanner(System.in);
		
		
		

		for (int magazine = 0; magazine < 3; magazine++) {
			System.out.println("Start!! 원하는 모드를 선택해주세요.");
			System.out.println("남은 탄창: " + (magazine+1));
			System.out.println("1: 단발 모드");
			System.out.println("2: 점사 모드");
			int select = sc.nextInt(); //모드 입력
			
			String sound = "탕!";
			int bullet = 30; //탄창 하나에 들은 총알 수 
			int shot = 1;

			switch (select) {
				case 1:
					break;
					
				case 2:
				default:
					System.out.println("shot: " + shot);
					sound = "타타탕!";
					shot = 3;
					
					break;
			}
			
			
			//총소리 출력!!
			for (int i = 0; i < bullet; i = i + shot) {
				System.out.println(sound );
			}
			
		}
		
		
		
		
		
		
		
//		switch (num) {
//		case 1: //단발 모드
//			System.out.println("단발 모드 시작");
//			bullet = 30;
//			for (int i = 0; i < bullet; i++) {
//				System.out.println("탕! " + (bullet-i));
//			}
//			break;
//			
//		case 2: //점사 모드
//		default:
//			System.out.println("점사 모드 시작");
//			bullet = 30;
//			for (int i = 0; i < bullet; i=i+3) {
//				System.out.println("타타탕! " + (bullet-i));
//			}
//			break;
//		}
		
		
		
		System.out.println("==== ForTest9 Finish ====");

	}

}
