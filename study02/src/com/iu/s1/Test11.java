package com.iu.s1;

import java.util.Scanner;

public class Test11 {

	public static void main(String []args) {
		System.out.println("==== Test11 Start ====");
		
		//국어, 영어, 수학을 입력받음.
		//총점 평균 계산.
		
		//평균 90 이상 --> A
		//평균 80 이상 --> B
		//평균 70 이상 --> C
		//평균 60 이상 --> D
		//그 외 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; //총점
		double avg = sum / 3.0; 	//평균 
				
		System.out.println("총점: " + sum + ", 평균: " + avg);
		
		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println("==== Test11 Finish ====");
	}
}
