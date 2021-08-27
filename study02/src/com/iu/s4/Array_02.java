package com.iu.s4;

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목의 수를 입력하세요: ");
		int arrSize = sc.nextInt();
		
		int []nums = new int[arrSize];
		
		int score = 0; //총점 
		
		//index는 0으로 시작해서 1씩 증가
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i+1)+"번째 점수를 입력하세요: ");
			nums[i] = sc.nextInt();
			score += nums[i];
		}
		
		//총점과 평균 출력
		System.out.println("총점: " + score);
		System.out.println("평균: " + (double)score/nums.length);
		
	}

}
