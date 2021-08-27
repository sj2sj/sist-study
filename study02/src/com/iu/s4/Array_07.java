package com.iu.s4;

public class Array_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//한 학생의 정보 
		//이름, 번호, 국어점수, 영어점수, 수학점수, 총점, 평균으로 구성 .
		
//		String name = "iu";
//		int num = 1;
//		int kor = 20;
//		int eng = 30;
//		int math = 40;
//		int total = kor+eng+math;
//		double avg = total/3.0;
//		
		
		
		String[] name = new String[3];
		name[0] = "iu";
		name[1] = "choa";
		name[2] = "suji";
		
		int[] num = new int[3];
		num[0] = 5;
		num[1] = 29;
		num[2] = 2;
		
		
		//이름과 번호를 출력 
		//번호 순서대로 출력해주세요!!
		
		//오름차순 정렬 
		for (int idx = 0; idx < num.length-1; idx++) { 
			for (int i = idx+1; i < num.length; i++) {
				if (num[idx] > num[i]) {
					int temp = num[i];
					String temp2 = name[i];
					
					num[i] = num[idx];
					num[idx] = temp;
					name[i] = name[idx];
					name[idx] = temp2;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("num: " + num[i] +", ");
			System.out.println("name: " + name[i]);
		}
	}

}
