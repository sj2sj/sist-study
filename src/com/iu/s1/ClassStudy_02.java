package com.iu.s1;

import java.util.Scanner;

public class ClassStudy_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==== Study2 Start ====");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요."); 
		int stdNum = sc.nextInt();
		
		Student[] stds = new Student[stdNum]; //객체 배열 생성
		
		for (int i = 0; i < stds.length; i++) {
			stds[i] = new Student(); //객체 생성 
			
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요: ");
			stds[i].name = sc.next();
			
			System.out.println((i+1)+"번째 학생의 번호를 입력하세요: ");
			stds[i].num = sc.nextInt();
			
			System.out.println((i+1)+"번째 학생의 국어 점수를 입력하세요: ");
			stds[i].kor = sc.nextInt();
			
			System.out.println((i+1)+"번째 학생의 영어 점수를 입력하세요: ");
			stds[i].eng = sc.nextInt();
			
			System.out.println((i+1)+"번째 학생의 수학 점수를 입력하세요: ");
			stds[i].math = sc.nextInt();
			
			stds[i].total = stds[i].kor + stds[i].eng + stds[i].math;
			stds[i].avg = stds[i].total/3.0;
		}
		
		//학생의 수 만큼 정보를 입력..
		//정보 - 이름, 번호, 국어, 영어, 수학 
		//총점, 평균 
		
		//모든 학생의 정보를 출력해라
		
		for (int i = 0; i < stds.length; i++) {
			System.out.println("=====" +(i+1)+"=====");
			System.out.println(" 이름: " + stds[i].name);
			System.out.println(" 번호: " + stds[i].num);
			System.out.println(" 국어 점수: " + stds[i].kor);
			System.out.println(" 영어 점수: " + stds[i].eng);
			System.out.println(" 수학 점수: " + stds[i].math);
			System.out.println(" 총점: " + stds[i].total);
			System.out.println(" 평균: " + stds[i].avg);
			System.out.println("=====================");
		}
		
		
		System.out.println("==== Study2 Finish ====");
	}

}
