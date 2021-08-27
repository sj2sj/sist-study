package com.iu.s2;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== ForTest8 Start ====");
		
		//분초 출력
		//0분 0초
		//0분 1초
		//0분 2초
		//...
		//0분 59초
		//1분 0초...1분 59초
		//...
		//59분 59초
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분을 입력하세요: ");
		int inputBun = sc.nextInt();
		System.out.println("초를 입력하세요: ");
		int inputCho = sc.nextInt();
		
		for (int bun = 0; bun < 60; bun++) { //분 출력 
			for (int cho = 0; cho < 60; cho++) { //초 출력 
				System.out.println(bun+"분 "+cho+"초");
				if (bun == inputBun && cho == inputCho) break;
			}
			if (bun == inputBun) break;
		}
	
		
		
		System.out.println("==== ForTest8 Finish ====");
	}

}
