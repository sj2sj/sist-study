package com.iu.s4;

import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//11, 20, 32
		int num1 = 11;
		int num2 = 20;
		num2 = 30;
		
		int []numbers = new int[3];
		//numbers의 데이터타입은? int []
		
		System.out.println(numbers);
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		
		System.out.println(numbers[0]);
		
		System.out.println("배열 크기: "+numbers.length);
		
		
		
		// 3.12, 2.3, 4.123, 5.0 을 담을 수 있는 배열을 선언하고 데이터를 대입하라.
		double []numbers2 = new double[4];
		numbers2[0] = 3.12;
		numbers2[1] = 2.3;
		numbers2[2] = 4.123;
		numbers2[3] = 5.0;
		System.out.println(numbers2[3]);
		
		
		
		
		//문자열을 담을 배열 3칸짜리를 생성
		//아무것도 넣지 않고 모두 출력
		String []str = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println(str[i]);
		}
		
		
		//스캐너를 담을 배열을 2칸 짜리로 생성
		//아무것도 넣지 않고 모두 출력
		Scanner sc[] = new Scanner[2];
		for (int i = 0; i < 2; i++) {
			System.out.println(sc[i]);
		}
	}

}
