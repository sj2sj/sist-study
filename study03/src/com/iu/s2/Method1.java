package com.iu.s2;

import java.util.Scanner;

public class Method1 {

	//접근지정자 그외지정자 리턴타입 메서드명 (매개변수) {}
	
	public void	prn() {
		//print, if, for
		System.out.println("prn method 실행");
	}
	
	public void prn2() {
		int num = 10;
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello World!");
		}
		System.out.println("Num : " + num);
	}
	
	public void prn3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 Hello의 수: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Hello");
		}
	}
	
	public void prn4(int num) {
	
		for (int i = 0; i < num; i++) {
			System.out.println("prn4 Hello!!");
		}
	}
}
