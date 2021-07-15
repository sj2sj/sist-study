package com.iu.s4;

public class Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = new int[2];
		ar1[0] = 10;
		ar1[1] = 20;
		
		int[] ar2;
		
		//얕은 복사 (참조 주소 복사)
		ar2 = ar1;
		
		System.out.println(ar2[0]);
		
		//참조 주소가 같음!
		System.out.println(ar1);
		System.out.println(ar2);
		
		ar1[1] = 1111;
		System.out.println(ar2[1]); //1111

		
		int[] ar3 = new int[ar1.length];
		System.out.println(ar3[0]);
		
		
		//깊은 복사 (데이터 값을 복사)
		for (int i = 0; i < ar1.length; i++) {
			ar3[i] = ar1[i];
		}
		System.out.println(ar3[0]);
		
		ar1[0] = 2222;
		System.out.println(ar3[0]); //10
	}

}
