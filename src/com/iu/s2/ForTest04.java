package com.iu.s2;

public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== ForTest4 Start ====");
		
		
		//1+2+3+ .... +1000000
		int hap = 0; //합계가 들어갈 변수
		
		//누적 함수
//		hap = hap + 1;
//		hap = hap + 2;
		//......
		
		for (int i = 0; i <= 5; i++) {
			hap = hap+i;
		}
		
		System.out.println("합계: " + hap);
		
		
		System.out.println("==== ForTest4 Finish ====");
	}

}
