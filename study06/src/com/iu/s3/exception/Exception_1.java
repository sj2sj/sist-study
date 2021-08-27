package com.iu.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start!");
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean check = true;
		while(check) {
			//try-catch문은 한 개의 try 안에 여러 개의 catch를 사용 가능하다.
			try {
				System.out.println("숫자를 입력");
				int num = sc.nextInt();
				//throw new InputMismatchException();
				
				int num2 = 20;
			
				int num3 = num2 / num;
				
				//예외가 발생하면 예외 객체 생성
				//예외 발생 시 밑의 코드를 실행하지 않고 바로 catch문으로 넘어감
				//ArithmeticException ae = new ArithmeticException();
				
				System.out.println(num3);
				check = false;
				//이 print문까지 넘어왔다는 것은 위에서 예외가 발생하지 않았다는 것
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("예외 처리 끝 ");
			} catch (RuntimeException e) {
				System.out.println("숫자만 입력하세요..");
				sc.next(); //버퍼를 비워주기 위함
			} catch (Exception e) {
				
			}
		}
		
		
		
		
		System.out.println("Finish!");
	}

}
