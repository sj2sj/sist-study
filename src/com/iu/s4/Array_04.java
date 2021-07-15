package com.iu.s4;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar1 = new int[3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		
		int[] ar2 = new int[ar1.length+1];
		
		//2. 배열 복사
		for (int i = 0; i < ar1.length; i++) {
			ar2[i] = ar1[i];
		}
		
		ar1 = ar2;
		ar1[ar1.length-1] = 4;
		
		//1. ar1에 4라는 값을 추가하고 싶으면 어떻게?
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
	}

}
