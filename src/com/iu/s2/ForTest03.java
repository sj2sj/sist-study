package com.iu.s2;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== ForTest3 Start ====");
		
		
		//종료 시간 입력받기
		//ex. 12초 입력 --> 12초에 끝.
		//단, 60이라는 상수는 변경할 수 없다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종료 시간을 입력하세요: ");
		int count = sc.nextInt();
		
		for (int sec = 0; sec < 60; sec++) {
			System.out.println(sec+"초");
			if (count == sec) break;
		}
		
		System.out.println("==== ForTest3 Finish ====");
	}

}
