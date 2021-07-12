package study02;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test8 Start ====");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요: ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;	//합계 
		double avg = sum / 3.0;		//평균 
		
		System.out.println("총점은 " + sum + "점, 평균은 " + avg + "점");
	
		
		//합격 기준
		//평균이 60점 이상
		//과목당 40점 이상
		
		if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			System.out.println("합격입니다!!");
		} else {
			System.out.println("불합격입니다 ㅠㅠ");
		}
		
		
		
		
		
		System.out.println("==== Test8 Finish ====");
	}

}
