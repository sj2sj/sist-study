package com.iu.s2;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== ForTest5 Start ====");
		
		
		
		Scanner sc = new Scanner(System.in);
		//과목수 입력
		System.out.println("과목 수를 입력하세요: ");
		int num = sc.nextInt();
		
		int total = 0;  //합계
		
		//과목수 만큼 점수 입력
		for (int i = 0; i < num; i++) {
			System.out.println(i+1+"번째 과목 점수를 입력하세요: ");
			int score = sc.nextInt();
			total += score;
		}
		
		
		//총점 평균 계산 후 출력 
		System.out.println("총점: " + total);
		System.out.println("평균: " + (double)total/num);
		
		
		System.out.println("==== ForTest5 Finish ====");
	}

}
