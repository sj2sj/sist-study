package com.iu.s1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Test10 Start ====");
		//941223-1234567 누가봐도 앞구르기하면서 봐도 뒷구르기하면서 봐도 주민등록번호!!
		//48342402349234 <- 암호화
		
		//어떤 숫자가 들어오면 그 숫자를 암호화해서 다른 숫자로 바꿔버리기!!
		/* 숫자1이 들어오면 숫자1을 암호화하는 연산식을 통해서 1로 바꾼다...?
		 * 0   -----> 0
		 * 1   -----> 1
		 * 2   -----> 2
		 * 3   -----> 3
		 * 4   -----> 10
		 * 7   -----> 13
		 * 8   -----> 20
		 * 12  -----> 30
		 * 13  -----> 31
		 * */
		
		int num = 0;
		
		//실행 중에 데이터를 키보드로부터 입력받을 준비..
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		
		int result = 0;
		
		
		result = (num / 4)*6 + num;
		
		System.out.println("result: " + result);
	}

}
