package com.iu.s1;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test6 Start ====");
		
		/*
		 * int num = 44;
		 * 
		 * if (num % 2 == 0) { //짝수 System.out.println("짝수!"); } else {
		 * System.out.println("홀수!!"); }
		 */
		
		
		//kor, eng, math를 입력받아 평균을 계산해서 60점 이상이면 합격, 미만이면 불합격.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;	//합계 
		double avg = sum / 3.0;		//평균 
		
		System.out.println("총점은 " + sum + "점, 평균은 " + avg + "점");
	
		//단일 if문으로 구현하기 
		String result = "불합격";
		
		if (avg >= 60) {
			result = "합격";
		}
		System.out.println(result+"입니다!");
		
		
		/*
		if (avg >= 60) {	//평균이 60점 이상이면 합격 
			System.out.println("합격입니다!!");
		} else {
			System.out.println("불합격 입니다 ㅠㅠ");
		}
		*/
		
		System.out.println("==== Test6 Finish ====");
	}

}
