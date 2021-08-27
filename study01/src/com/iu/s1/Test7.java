package com.iu.s1;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test7 Start ====");
		
		int kor = 56;
		int eng = 65;
		int math = 49;
		
		int total = kor + eng + math;
		
		double avg = total / 3.0;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg); //56.66666666664
		
		avg = (int)(avg * 100) / 100.0;

		System.out.println("총점: " + total); //170
		System.out.println("평균: " + avg); //56.66 (소수점 둘째자리까지)
//		System.out.printf("%.2f", avg);
	}

}
