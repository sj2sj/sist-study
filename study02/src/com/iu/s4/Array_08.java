package com.iu.s4;

import java.util.Scanner;

public class Array_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ids = {1234, 4567, 4356, 1258};
		int[] pws = {6789, 5437, 1235, 9874};
		
		//1. 로그인
		//2. 회원가입
		//3. 종료 
		
		
		// 로그인 성공 시 ------> 메인 메뉴가 변경
		// 1. 로그아웃 
		// 2. 회원탈퇴
		
		Scanner sc = new Scanner(System.in);
		
		
		
		boolean flag = true; 		//프로그램 종료를 결정하는 flag
		boolean loginYN = false; 	//로그인 여부 (true: 로그인, false: 비로그인)
		int loginId = 0; 			//로그인 된 아이디
		
		while (flag) {

			if (loginYN) { //로그인 상태일 때 
				System.out.println("현재 로그인 된 아이디: " + loginId);
				
				System.out.println("===========");
				System.out.println("1. 로그아웃");
				System.out.println("2. 회원탈퇴");
				System.out.println("===========");
				
				int select = sc.nextInt(); //선택 번호
				switch (select) {
					case 1: // ------------------------------ 로그아웃
						loginYN = false;
						System.out.println("로그아웃 되었습니다. ");
						break;
					case 2: // ------------------------------ 회원탈퇴 
						boolean drop = false;
						
						System.out.println("탈퇴하시려면 비밀번호를 입력해주세요: ");
						int inputPw = sc.nextInt(); //입력받은 비밀번호 
						
						for (int i = 0; i < ids.length; i++) {
							if (loginId == ids[i] && inputPw == pws[i]) { //비밀번호가 일치하면 회원탈퇴 처리한다.
								drop = true;
								break;
							}
						}
						
						if (drop) { //회원탈퇴 
							int[] ids2 = new int[ids.length-1];
							int[] pws2 = new int[pws.length-1];
							
							int idx = 0;
							for (int i = 0; i < ids2.length; i++) {
								if (loginId == ids[i]) {
									continue;
								} else {
									ids2[idx] = ids[i];
									pws2[idx] = pws[i];
									idx++;
								}
							}
							
							ids = ids2;
							pws = pws2;
							loginYN = false;
						} else {
							System.out.println("비밀번호가 틀립니다. ");
						}
						
						
						
						break;
				}
				
			} else { //비로그인 상태일 때 
				System.out.println("===========");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("3. 종료");
				System.out.println("===========");
				int select = sc.nextInt(); //선택 번호 
				
				switch (select) {
					case 1: // ------------------------------ 로그인 
						
						System.out.println("아이디를 입력하세요: ");
						int id = sc.nextInt();
						System.out.println("비밀번호를 입력하세요: ");
						int pw = sc.nextInt();
					
						
						//ids 배열에 입력된 id가 존재하는지 체크한다. 
						for (int i = 0; i < ids.length; i++) {
							if (ids[i] == id && pws[i] == pw) { 
								loginYN = true;
								loginId = ids[i];
								break;
							}
						}
						
						
						if (loginYN) {
							System.out.println("로그인에 성공했습니다.");
						} else {
							System.out.println("로그인에 실패했습니다.");
						}
						
						
						break;
					
					case 2: //------------------------------ 회원가입
						boolean check = false; //중복 아이디 체크 (true: 중복값 존재, false: 중복값 없음.)
						
						System.out.println("생성할 아이디를 입력하세요: ");
						int inputId = sc.nextInt();
						
						//입력한 아이디 중복 체크
						for (int i = 0; i < ids.length; i++) {
							if (inputId == ids[i]) {
								check = true;
								break;
							} 
						}
						
						if (check) {
							System.out.println("이미 존재하는 아이디 입니다.");
							break;
						} else { //아이디 생성 
							int[] ids2 = new int[ids.length+1];
							int[] pws2 = new int[pws.length+1];
							
							//배열 복사
							for (int i = 0; i < ids.length; i++) {
								ids2[i] = ids[i];
								pws2[i] = pws[i];
							}
							
							ids2[ids.length] = inputId;
							
							System.out.println("비밀번호를 입력하세요: ");
							pws2[pws.length] = sc.nextInt();
							
							ids = ids2;
							pws = pws2;
						}
						
						
						System.out.println("생성되었습니다!");
						break;
						
						
					default: //------------------------------ 종료
						flag = false;
						System.out.println("종료");
						break;
				}
			}
			
			
		}
		
		
		
		

		
	}

}
