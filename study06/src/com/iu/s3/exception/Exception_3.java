package com.iu.s3.exception;

public class Exception_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 test3 = new Test3();
		
		try {
			test3.t3();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("예외처리 시작");
			e.printStackTrace();
		}
		
	}

}
