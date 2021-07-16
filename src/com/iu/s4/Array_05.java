package com.iu.s4;

import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 정보 출력
		//2. 정보 추가
		//3. 정보 삭제
		//4. 종료
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true; //while제어 flag
		
		int[] ar = {45, 52, 76};
		
		while (flag) {
			System.out.println("\n======================");
			System.out.println("1. 정보 출력 ");
			System.out.println("2. 정보 추가 ");
			System.out.println("3. 정보 삭제 ");
			System.out.println("4. 검색 삭제 ");
			System.out.println("5. 종료 ");
			System.out.println("======================");
			int select = sc.nextInt();
			
			
			switch(select) {
				case 1: //정보 출력 
					if (ar.length > 0) { //값이 있으면
						for (int i = 0; i < ar.length; i++) {
							System.out.print(ar[i] + " ");
						}
					} else {
						System.out.println("출력할 값이 없습니다!");
					}
					
					break;
				case 2: //정보 추가 
					System.out.println("정보를 추가합니다. ");
					System.out.println("추가할 값: ");
					int n = sc.nextInt(); //추가할 값 입력
					
					int[] ar2 = new int[ar.length+1];
					
					//배열 복사 
					for (int i = 0; i < ar.length; i++) {
						ar2[i] = ar[i];
					}
					ar2[ar.length] = n;
					ar = ar2;
					
					break;
				case 3: //정보 삭제 
					System.out.println("정보를 삭제합니다. (마지막 값이 삭제 됨.) ");
					
					if (ar.length == 0) {
						System.out.println("더 이상 삭제할 값이 없습니다. ");
						continue;
					}
					
					int[] ar3 = new int[ar.length-1];
					
					//배열 복사
					for (int i = 0; i < ar3.length; i++) {
						ar3[i] = ar[i];
					}
					ar = ar3;
					
					break;
				case 4: //검색 삭제 
					if (ar.length == 0) {
						System.out.println("더 이상 삭제할 값이 없습니다. ");
						continue;
					}
					
					System.out.println("삭제할 인덱스 번호를 입력하세요: ");
					int d = sc.nextInt(); //삭제할 인덱스 번호.
	
					if (d >= ar.length || d < 0) { //삭제하려는 인덱스가 배열 길이보다 클 때 
						System.out.println("인덱스가 존재하지 않습니다!!");
						continue;
					} else { //인덱스 삭제 
						int[] ar4 = new int[ar.length-1];
						
						for (int i = 0, j = 0; i < ar.length; i++) {
							if (i == d) {
								continue;
							} else {
								ar4[j] = ar[i];
								j++;
							}
						}
						ar = ar4;
					}
					
					break;
				default:
					System.out.println("종료합니다.");
					flag = false;
			}
		}
	}

}
