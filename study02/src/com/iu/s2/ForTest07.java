package com.iu.s2;

public class ForTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==== ForTest7 Start ====");
		
		/* 이중 for문 - for 안의 for */
		
		
		for (int dan=2; dan<10; dan++) {
			System.out.println(dan+"단");
			for (int num=1; num<10; num++) {
				System.out.println(dan + "*" + num + "=" + dan*num);
			}
			System.out.println("================");
		}
		
		System.out.println("==== ForTest7 Finish ====");

	}

}
