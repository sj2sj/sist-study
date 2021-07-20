package com.iu.s2.ex2;

import java.util.Scanner;


public class StudentInput {
	
	public Student[] addArray(Student[] stds) {
		//1. 새로운배열 생성, 기존에 존재하는 배열을 복사한다.
		//2. 기존 배열의 값을 복사 
		
		Student[] stds2 = new Student[stds.length+1];
		
		for (int i = 0; i < stds.length; i++) {
			stds2[i] = new Student();
			stds2[i] = stds[i];
		}
		return stds2;
	}

	public Student makeStudent() {
		//학생 한 명 생성
		//이름, 번호, 국어, 영어, 수학 입력 받아서 총점, 평균 계산
		
		Scanner sc = new Scanner(System.in);
		
		Student addStd = new Student();

		
		System.out.println("추가할 학생의 이름을 입력하세요: ");
		addStd.name = sc.next();
		
		System.out.println("추가할 학생의 번호를 입력하세요: ");
		addStd.num = sc.nextInt();
		

		
		//번호 중복 받지 않도록
//		boolean check2 = false; //존재: true, 존재x: false
//		for (int i = 0; i < stds.length; i++) {
//			if (addStd.num == stds[i].num && stds[i].num != null) { //추가하려는 번호의 학생이 존재하면 
//				check2 = true;
//				break;
//			}
//		}
//		
//		if (check2) { //번호 중복시 학생을 추가하지 않음 
//			System.out.println("이미 이 번호를 가진 학생이 있습니다. 다른 번호를 입력해주세요!!");
//			return stds;
//		}
		
		System.out.println("추가할 학생의 국어 점수를 입력하세요: ");
		addStd.kor = sc.nextInt();
		
		System.out.println("추가할 학생의 영어 점수를 입력하세요: ");
		addStd.eng = sc.nextInt();
		
		System.out.println("추가할 학생의 수학 점수를 입력하세요: ");
		addStd.math = sc.nextInt();
		
		addStd.total = addStd.kor + addStd.eng + addStd.math;
		addStd.avg = addStd.total/3.0;

		return addStd;
	}
}
