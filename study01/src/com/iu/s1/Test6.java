package com.iu.s1;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test6 Start ====");
		
		
		int num = 5;
		double num2 = 3.12;
		
		num = num + (int)num2;
		System.out.println("num: " + num); //8
		
		//점수 구하기 ...
		int kor = 63;
		int eng = 35;
		int math = 53;
		
		//총점 계산해서 총점 출력
		int sum = kor + eng + math;
		System.out.println("총: " + sum);
		
		//평균 출력
		//50.0이 나온 이유: sum도 정수형 3도 정수형. 계산 하면 소수점 없는 결과값이 나옴. 그러고 나서 대입했기 때문에 50.0이라는 결과가 나옴.
		double avg = sum/3.0;
		System.out.println("평균: " + avg);
		
		double num3 = 5.924;
		int result = (int)num3;
		System.out.println("result: " + result);
	}

}
