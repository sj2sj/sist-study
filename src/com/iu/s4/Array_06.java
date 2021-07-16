package com.iu.s4;

public class Array_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {3, 5, 1, 7, 4};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] +" "); 
		}
		
		//정렬
		//1. 높은 -> 낮은 (내림차순)
		//2. 낮은 -> 높은 (오름차순)
		
		
		//내림차순 desc
		//{7, 3, 5, 1, 4}
		//{7, 5, 3, 1, 4}
		//{7, 5, 4, 3, 1}
		
		for (int idx = 0; idx < ar.length-1; idx++) {
			for (int i = idx+1; i < ar.length; i++) {
				if (ar[idx] < ar[i]) {
					int temp = ar[i]; //큰 값을 저장 
					ar[i] = ar[idx];
					ar[idx] = temp;
				}
			}
			
		}
		

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] +" "); 
		}
	}

}
