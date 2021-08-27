package com.iu.s2;

import java.util.Scanner;

public class MethodMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==== Method1 Start ====");
		
		Scanner sc = new Scanner(System.in);
		
		Method1 mth1 = new Method1();
		//참조변수명.메서드명();
		//메서드 호출
		mth1.prn();
		
		//prn2 호출
		mth1.prn2();
		
		int num = 20;
		System.out.println("Main Num: " + num);
		
//		mth1.prn3();
		
		
		System.out.println("출력할 hello의 수: ");
		int n = sc.nextInt();
		mth1.prn4(n);
		
		System.out.println("==== Method1 Finish ====");
	}

}
