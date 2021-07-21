package com.iu.s2.ex2;

import java.util.Scanner;


public class StudentController {

	public void start() {
		//1. 전체 정보 출력 
		//2. 학생 번호 검색
		//3. 학생 정보 추가 - 학생 한명을 배열에 추가
		//4. 학생 성적순으로 출력 
		//5. 프로그램 종료 
		Scanner sc = new Scanner(System.in);
		
		StudentView view = new StudentView();
		StudentInput input = new StudentInput();
		StudentSort sort = new StudentSort();
		
		
		System.out.println("학생 수를 입력하세요."); 
		int stdNum = sc.nextInt();
		
		Student[] stds = new Student[stdNum]; //객체 배열 생성
		
		for (int i = 0; i < stdNum; i++) {
			stds[i] = input.makeStudent();
		}
		
		boolean flag = true;
		while (flag) {
			System.out.println("1. 전체 정보 출력");
			System.out.println("2. 학생 번호 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 학생 성적순 정렬");
			System.out.println("5. 종료");
			
			
			int select = sc.nextInt(); //선택번호
			switch(select) {
				case 1: //--------------------------------- 전체 정보 출력 
					System.out.println("전체 정보를 출력합니다.");
					view.viewAll(stds);
					break;
				case 2: //--------------------------------- 학생 번호 검색
					System.out.println("학생의 번호를 입력하세요: ");
					int stdNo = sc.nextInt();
					
					Student searchStd = null;
					for (int i = 0; i < stds.length; i++) {
						if (stdNo == stds[i].num) { //찾으려는 번호의 학생이 존재하면 
							searchStd = stds[i];

							break;
						}
					}
					
					if (searchStd != null) { //찾는 번호를 가진 학생이 있으면 
						view.viewOne(searchStd);
					} else {
						System.out.println("해당 번호를 가진 학생이 없습니다. ");
					}

					break;
				case 3: //--------------------------------- 학생 정보 추가			
					//배열 복사
					stds = input.addArray(stds);
					
					stds[stds.length-1] = input.makeStudent();

					break;
				case 4:
					System.out.println("학생 성적순으로 출력");
					stds = sort.sortByAvg(stds);
					view.viewAll(stds);
					break;
				default:
					System.out.println("종료");
					flag = false;
			}
		}
		
	}
	
}
