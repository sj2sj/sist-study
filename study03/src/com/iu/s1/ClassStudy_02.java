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
		
//		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
//		System.out.println("=======================================================");
//		
//		for (int i = 0; i < stds.length; i++) {
//			System.out.print(stds[i].name + "\t");
//			System.out.print(stds[i].num + "\t");
//			System.out.print(stds[i].kor + "\t");
//			System.out.print(stds[i].eng + "\t");
//			System.out.print(stds[i].math + "\t");
//			System.out.print(stds[i].total + "\t");
//			System.out.println(stds[i].avg);
//		}
		
		
		
		
		//20210719(월) 숙제
		//1. 전체 정보 출력 
		//2. 학생 번호 검색 --> 학생이 없으면 없다고 출력
		//3. (시간 남으면) 학생 정보 추가 - 학생 한명을 배열에 추가
		//4. (시간 또 남으면) 학생 성적순으로 출력 
		//5. 프로그램 종료 
		
		boolean flag = true; //while문을 종료하기 위한 flag , false: 종료
		while (flag) {
			System.out.println("1. 전체 정보 출력");
			System.out.println("2. 학생 번호 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 학생 성적순 정렬");
			System.out.println("5. 종료");
			int select = sc.nextInt(); //선택번호
			switch(select) {
				case 1: //--------------------------------- 전체 정보 출력 
					System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
					System.out.println("=======================================================");
					
					for (int i = 0; i < stds.length; i++) {
						System.out.print(stds[i].name + "\t");
						System.out.print(stds[i].num + "\t");
						System.out.print(stds[i].kor + "\t");
						System.out.print(stds[i].eng + "\t");
						System.out.print(stds[i].math + "\t");
						System.out.print(stds[i].total + "\t");
						System.out.println(stds[i].avg);
					}
					break;
					
				case 2: //--------------------------------- 학생 번호 검색
					System.out.println("학생의 번호를 입력하세요: ");
					int stdNo = sc.nextInt();
					
					int idx = 0;
					boolean check = false; //존재하면: true, 존재하지 않으면: false
					for (int i = 0; i < stds.length; i++) {
						if (stdNo == stds[i].num) { //찾으려는 번호의 학생이 존재하면 
							idx = i;
							check = true;
							break;
						}
					}
					if (check) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
						System.out.println("=======================================================");
						
						System.out.print(stds[idx].name + "\t");
						System.out.print(stds[idx].num + "\t");
						System.out.print(stds[idx].kor + "\t");
						System.out.print(stds[idx].eng + "\t");
						System.out.print(stds[idx].math + "\t");
						System.out.print(stds[idx].total + "\t");
						System.out.println(stds[idx].avg);
					} else {
						System.out.println("해당 번호를 가진 학생이 없습니다. ");
					}
					break;
					
				case 3: //--------------------------------- 학생 정보 추가
					
					Student addStd = new Student();
					Student[] stds2 = new Student[stds.length+1];
					
					//배열 복사
					for (int i = 0; i < stds.length; i++) {
						stds2[i] = new Student();
						stds2[i] = stds[i];
					}
					
					System.out.println("추가할 학생의 이름을 입력하세요: ");
					addStd.name = sc.next();
					
					System.out.println("추가할 학생의 번호를 입력하세요: ");
					addStd.num = sc.nextInt();
					
					
					//번호 중복 받지 않도록
					boolean check2 = false; //존재: true, 존재x: false
					for (int i = 0; i < stds.length; i++) {
						if (addStd.num == stds[i].num) { //추가하려는 번호의 학생이 존재하면 
							check2 = true;
							break;
						}
					}
					
					if (check2) { //번호 중복시 학생을 추가하지 않음 
						System.out.println("이미 이 번호를 가진 학생이 있습니다. 다른 번호를 입력해주세요!!");
						break;
					}
					
					System.out.println("추가할 학생의 국어 점수를 입력하세요: ");
					addStd.kor = sc.nextInt();
					
					System.out.println("추가할 학생의 영어 점수를 입력하세요: ");
					addStd.eng = sc.nextInt();
					
					System.out.println("추가할 학생의 수학 점수를 입력하세요: ");
					addStd.math = sc.nextInt();
					
					addStd.total = addStd.kor + addStd.eng + addStd.math;
					addStd.avg = addStd.total/3.0;
					
					stds2[stds.length] = addStd;
					stds = stds2;
					
					break;
					
					
				case 4: //--------------------------------- 학생을 성적순으로 정렬 (내림차순)
					
					Student sortStd = new Student(); //임시 Student 객체 
					for (int sortIdx = 0; sortIdx < stds.length-1; sortIdx++) {
						for (int i = sortIdx+1; i < stds.length; i++) {
							if (stds[sortIdx].total < stds[i].total) {
								sortStd = stds[i];
								stds[i] = stds[sortIdx];
								stds[sortIdx] = sortStd;
							}
						}
					}
					
					break;
					
					
				default: //--------------------------------- 종료
					flag = false;
			}
		}
		
		
		
		
		
		
		
		System.out.println("==== Study2 Finish ====");
	}

}
