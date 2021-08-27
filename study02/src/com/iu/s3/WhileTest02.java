package com.iu.s3;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== WhileTest2 Start!! ====");
		
		int id = 1234;
		int pw = 5678;
		
		//1. 로그인
		//   -id, pw입력 받아 로그인 판단
		//    로그인 성공 시 종료, 로그인 실패 시 다시 1,2 물어보기.
		//2. 종  료 
		
		
		//로그인 성공했거나 또는 종료를 입력했을 때!
		//로그인이 성공했으면 rpg 게임을 시작합니당.
		
		/* rpg 게임 */
		//최초 레벨은 1, 최종 레벨은 15.
		//최초gold는 0, 레벨5를 달성했을 때 1000gold, 레벨10을 달성했을 때 2000gold, 레벨15를 달성했을 때 3000gold를 받는다.
		//모든 몬스터의 경험치는 동일
		// 1 ->2 : 3마리
		// 몬스터 1마리 사냥 *3 출력
		// 레벨 업 출력
		// 2 ->3 : 6마리
		// 3 ->4 : 9마리 ..
		// .......
		// 14-> 15 : 42마리
		// 최종 레벨 출력, 최종 골드 출력.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean loginYN = false; //로그인 여부 true=로그인 / false=비로그인 
		
		/* ------- 로그인 부분 ------- */
		while (true) {
			System.out.println("1: 로그인 ");
			System.out.println("2: 종료 ");
			int select = sc.nextInt(); //선택 값 
			
			if (select == 1) {
				System.out.println("로그인 부분 ..");
				
				System.out.println("아이디: ");
				int inputId = sc.nextInt(); //아이디 입력 
				System.out.println("비밀번호: ");
				int inputPw = sc.nextInt(); //패스워드 입력 
				
				if (id == inputId && pw == inputPw) {
					loginYN = true;
					System.out.println("로그인 성공!");
					break;
				}
				System.out.println("로그인 실패 ㅠㅠ ");
			} //--------------------------------------if문 end
			else {
				System.out.println("종료");
				break;
			} //--------------------------------------else문 end
		} //--------------------------------------while문 end
		
		
		
		/* ------ rpg 게임 ------ */
		int level = 1;  //레벨 
		int gold = 0; 	//골드 
		
		if (loginYN) { //로그인 성공했을 시 rpg게임을 시작한다.
			System.out.println("rpg 게임을 시작하겠습니다! :)");
			
			for (level = 1; level <= 15; level++) {
				if ((level%5) == 0) { //레벨이 5, 10, 15일때 gold 지급.
					gold += 1000*(level/5);
					System.out.println((1000*(level/5))+"gold 지급");
				}
				if (level == 15) {break;} //최종레벨일 때 반복문 종료
				
				int reqExp = level*3; //레벨업에 필요한 경험치 세팅
				System.out.println("다음 레벨까지 사냥해야 하는 몬스터 수: "+reqExp);
				for (int i = 0; i < reqExp; i++) {	//몬스터 사냥
					System.out.println((i+1)+" 몬스터 1마리를 사냥했습니다.");
					
					if ((i+1) == reqExp) {
						System.out.println("레벨업!! 현재 레벨은 " + (level+1) + "입니다.");
					}
				}
			}
			System.out.println("최종 레벨: " + level);
			System.out.println("최종 gold: " + gold);
		} //rpg게임 종료 
		
		
		System.out.println("==== WhileTest2 Finish!! ====");

	}

}
